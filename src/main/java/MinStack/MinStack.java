package MinStack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

class MinStack {

    Stack<Integer> minStack;
    private Stack<Integer> stack;


    public MinStack() {

        this.stack = new Stack();
        this.minStack = new Stack<>();

    }

    public void push(int val) {

        if (minStack.isEmpty()) {
            minStack.add(val);
        }
        if (val <= minStack.peek()) {

            minStack.add(val);
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
        if (stack.isEmpty()) {
            minStack = new Stack<>();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
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