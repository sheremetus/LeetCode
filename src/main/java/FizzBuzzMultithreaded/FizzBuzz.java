package FizzBuzzMultithreaded;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

class FizzBuzz {
    private final int n;
    private final AtomicInteger counter;

    public FizzBuzz(int n) {
        this.n = n;

        this.counter = new AtomicInteger(1);
    }

    // printFizz.run() outputs "fizz".
    synchronized public void fizz(Runnable printFizz) throws InterruptedException {
        while (counter.get() <= n) {

            while (counter.get() <= n && (counter.get() % 3 != 0 || counter.get() % 5 == 0)) {
                this.wait();
            }
            if (counter.get() > n) {
                break;
            }
            printFizz.run();
            counter.incrementAndGet();
            this.notifyAll();
        }
    }

    synchronized public void buzz(Runnable printBuzz) throws InterruptedException {
        while (counter.get() <= n) {
            // Спим, если число НЕ делится на 5 ИЛИ делится на 3 (это чужая очередь)
            while (counter.get() <= n && (counter.get() % 5 != 0 || counter.get() % 3 == 0)) {
                this.wait();
            }
            if (counter.get() > n) {
                break;
            }
            printBuzz.run();
            counter.incrementAndGet();
            this.notifyAll();
        }
    }

    synchronized public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (counter.get() <= n) {

            while (counter.get() <= n && (counter.get() % 3 != 0 || counter.get() % 5 != 0)) {
                this.wait();
            }
            if (counter.get() > n) {
                break;
            }
            printFizzBuzz.run();
            counter.incrementAndGet();
            this.notifyAll();
        }
    }


    synchronized public void number(IntConsumer printNumber) throws InterruptedException {
        while (counter.get() <= n) {

            while (counter.get() <= n && (counter.get() % 3 == 0 || counter.get() % 5 == 0)) {
                this.wait();
            }
            if (counter.get() > n) {
                break;
            }
            printNumber.accept(counter.get());
            counter.incrementAndGet();
            this.notifyAll();
        }
    }
}