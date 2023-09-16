package excercise;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pairs {
    public static void main(String[] ar) {
        int n = StdIn.readInt();
        int k = StdIn.readInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(StdIn.readInt());
        }
        System.out.println(pairs(k, list));
    }

    public static int pairs(int k, List<Integer> arr) {
        int f0 = 0;
        int f1 = 1;
        int d = 0;

        Collections.sort(arr);
        while (f1 < arr.size()) {
            if (arr.get(f1) - arr.get(f0) < k) {
                f1++;
            } else if (arr.get(f1) - arr.get(f0) > k) {
                f0++;
                f1 = f0 + 1;

            } else {
                f0++;
                f1++;
                d++;
            }
        }

        return d;
    }
}
