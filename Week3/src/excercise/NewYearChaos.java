package excercise;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class NewYearChaos {
    public static void main(String[] ar) {
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            int v = StdIn.readInt();
            List<Integer> q = new ArrayList<>();
            for (int j = 0; j < v; j++) {
                q.add(StdIn.readInt());
            }
            minimumBribes(q);
        }
    }
    //a[i] = 1 2 5 3 7 8 6 4
    //  i  = 0 1 2 3 4 5 6 7
    //                          i = 3, j = (0 -> 2)   a[i] = 3  <  a[j] = {5}    -> +1
    //                          i = 6, j = (0 -> 5)   a[i] = 6  <  a[j] = {7, 8} -> +2
    //                          i = 7, j = (0 -> 6)   a[i] = 4  <  a[j] = {5, 7, 8, 6} -> +4 => result = 7
    public static void minimumBribes(List<Integer> q) {
        int d = 0;
        boolean tooChaotic = false;

        for (int i = 0; i < q.size(); i++) {
            int a = q.get(i) - 2;

            if (a < 0) {
                a = 0;
            }

            if (q.get(i) - (i + 1) > 2) {
                tooChaotic = true;
                break;
            }

            for (int j = a; j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    d++;
                }
            }
        }

        if (tooChaotic) System.out.println("Too chaotic");
         else           System.out.println(d);

    }
}
