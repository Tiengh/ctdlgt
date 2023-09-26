package exercise;

import edu.princeton.cs.algs4.StdIn;

public class Bai5 {
    public static void main(String[] ar) {
        StringBuilder s = new StringBuilder("abcd");
        Stack<StringBuilder> stack = new Stack<>();
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            int inputType = StdIn.readInt();
            switch (inputType) {
                case 1: {
                    String x = StdIn.readString();
                    s.append(x);
                    break;
                }
                case 2: {
                    int x = StdIn.readInt();
                    StringBuilder temp = new StringBuilder();
                    for (int j = s.length() - 1 - x; j < s.length(); i++) {
                        temp.append(s.charAt(j));
                    }
                    stack.push(temp);
                    s.delete(s.length() - 1 - x, s.length() - 1);
                    break;
                }
                case 3: {
                    int x = StdIn.readInt();
                    System.out.println(s.charAt(x-1));
                    break;
                }
                case 4:{
                    if(!stack.isEmpty()){
                        s.append(stack.pop());
                    }
                    break;
                }
                default:{
                    System.err.println("Wrong choice");
                    break;
                }

            }
        }
    }
}
