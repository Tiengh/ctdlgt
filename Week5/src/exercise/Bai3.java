package exercise;

import edu.princeton.cs.algs4.StdIn;

public class Bai3 {
    public static void main(String[] args) {
        int q = StdIn.readInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < q; i++) {
            int queryType = StdIn.readInt();
            switch (queryType) {
                case 1:
                    int x = StdIn.readInt();
                    stack1.push(x);
                    break;
                case 2:
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                    }
                    if (!stack2.isEmpty()) {
                        stack2.pop();
                    }
                    break;
                case 3:
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                    }
                    if (!stack2.isEmpty()) {
                        System.out.println(stack2.peek());
                    }
                    break;
            }
        }
    }
}
