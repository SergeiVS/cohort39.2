package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("I");
        stack.push("love");
        stack.push("Java!");

        System.out.println(stack);

        String str = stack.peek();
        System.out.println(str);
        System.out.println(stack);

        str = stack.pop();
        System.out.println(str);
        System.out.println(stack);
    }
}
