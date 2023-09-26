package exercise;

import java.util.Collections;
import java.util.List;

public class Bai6 {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int high = 0, T1 = 0, T2 = 0, T3 = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        Collections.reverse(h1);
        Collections.reverse(h2);
        Collections.reverse(h3);

        for (Integer i : h1) {
            T1 += i;
            s1.push(T1);
        }
        for (Integer i : h2) {
            T2 += i;
            s2.push(T2);
        }
        for (Integer i : h3) {
            T3 += i;
            s3.push(T3);
        }
        while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
            if (T1 == T2 && T2 == T3) {
                high = T1;
                break;
            }

            if (T1 <= T2 && T1 <= T3) {
                int x = s2.pop();
                int y = s3.pop();
                T2 -= x;
                T3 -= y;
            } else if (T2 <= T1 && T2 <= T3) {
                int x = s1.pop();
                int y = s3.pop();
                T1 -= x;
                T3 -= y;
            } else {
                int x = s1.pop();
                int y = s2.pop();
                T1 -= x;
                T2 -= y;
            }
        }
        return high;
    }

    public static void main(String[] ar) {

    }
}
