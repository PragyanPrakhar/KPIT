import java.util.*;
// QUESTION 1 - Implement a custom stack using LinkedList
public class CustomStack {
    Deque<Integer> stack = new LinkedList<>();  // Can also use ArrayDeque

    public void push(int x) {
        stack.addLast(x);
    }

    public int pop() {
        if (!stack.isEmpty()) {
            return stack.removeLast();
        }
        throw new EmptyStackException();
    }

    public int peek() {
        if (!stack.isEmpty()) {
            return stack.peekLast();
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());  // Output: 20
        System.out.println(stack.peek()); // Output: 10
        System.out.println(stack.isEmpty()); // Output: false
    }
}
