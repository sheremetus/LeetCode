package MinStack;

import java.util.Stack;

class MinStack {


    private Integer min;
    private Integer secondMin;
    private Stack<Integer> stack;

    public MinStack() {
        this.stack = new Stack();
        this.min = Integer.MAX_VALUE;
        this.secondMin = Integer.MAX_VALUE;

    }

    public void push(int val) {


        if (val < min) {
            secondMin = min;
            min = val;

        }
        stack.push(val);
    }

    public void pop() {
        if (stack.peek().equals(min)) {
            min = secondMin;
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */