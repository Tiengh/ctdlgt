package exercise;

import edu.princeton.cs.algs4.StdIn;

public class Bai2 {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(') || (bracket == ']' && top != '[') || (bracket == '}' && top != '{')) {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            String s = StdIn.readString();
            System.out.println(isBalanced(s));
        }
    }
}
