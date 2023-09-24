package exercise;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


class Bai1{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) stack.push(item);
            else if (!stack.isEmpty()) StdOut.print(stack.pop() + " ");
        }
        StdOut.println("(" + stack.size() + " left on stack)");

//        Queue<String> queue = new Queue<String>();
//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            if (!item.equals("-"))
//                queue.enqueue(item);
//            else if (!queue.isEmpty())
//                StdOut.print(queue.dequeue() + " ");
//        }
//        StdOut.println("(" + queue.size() + " left on queue)");
    }
}
