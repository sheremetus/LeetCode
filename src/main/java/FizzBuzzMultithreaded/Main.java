package FizzBuzzMultithreaded;


import java.util.function.IntConsumer;

/**
 * You have the four functions:
 * <p>
 * printFizz that prints the word "fizz" to the console,
 * printBuzz that prints the word "buzz" to the console,
 * printFizzBuzz that prints the word "fizzbuzz" to the console, and
 * printNumber that prints a given integer to the console.
 * You are given an instance of the class FizzBuzz that has four functions: fizz, buzz, fizzbuzz and number. The same instance of FizzBuzz will be passed to four different threads:
 * <p>
 * Thread A: calls fizz() that should output the word "fizz".
 * Thread B: calls buzz() that should output the word "buzz".
 * Thread C: calls fizzbuzz() that should output the word "fizzbuzz".
 * Thread D: calls number() that should only output the integers.
 * Modify the given class to output the series [1, 2, "fizz", 4, "buzz", ...] where the ith token (1-indexed) of the series is:
 * <p>
 * "fizzbuzz" if i is divisible by 3 and 5,
 * "fizz" if i is divisible by 3 and not 5,
 * "buzz" if i is divisible by 5 and not 3, or
 * i if i is not divisible by 3 or 5.
 * Implement the FizzBuzz class:
 * <p>
 * FizzBuzz(int n) Initializes the object with the number n that represents the length of the sequence that should be printed.
 * void fizz(printFizz) Calls printFizz to output "fizz".
 * void buzz(printBuzz) Calls printBuzz to output "buzz".
 * void fizzbuzz(printFizzBuzz) Calls printFizzBuzz to output "fizzbuzz".
 * void number(printNumber) Calls printnumber to output the numbers.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 15
 * Output: [1,2,"fizz",4,"buzz","fizz",7,8,"fizz","buzz",11,"fizz",13,14,"fizzbuzz"]
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: [1,2,"fizz",4,"buzz"]
 */

public class Main {
    public static void main(String[] args) {


        FizzBuzz sharedFizzBuzz = new FizzBuzz(15);

        Runnable fizzRunnable = () -> System.out.println("fizz");
        Runnable buzzRunnable = () -> System.out.println("buzz");
        Runnable fizzbuzzRunnable = () -> System.out.println("fizzbuzz");
        IntConsumer fizzConsumer = (i) -> System.out.println(i);




            Thread threadA = new Thread(() -> {
                try {
                    sharedFizzBuzz.fizz(fizzRunnable);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread threadB = new Thread(() -> {
                try {
                    sharedFizzBuzz.buzz(buzzRunnable);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread threadC = new Thread(() -> {
                try {
                    sharedFizzBuzz.fizzbuzz(fizzbuzzRunnable);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread threadD = new Thread(() -> {
                try {
                    sharedFizzBuzz.number(fizzConsumer);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            threadA.start();
            threadB.start();
            threadC.start();
            threadD.start();



    }
}

