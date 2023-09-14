package excercise;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class SherlockAndArray {

    public static void main(String[] ar) {
        int n = StdIn.readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readInt();
        }
        System.out.println(IsSherlockAndArray(a, n));
    }


    public static Boolean IsSherlockAndArray(int[] a, int length) {

        if (length == 1) return true;
        if (length == 2) return false;


        for (int i = 1; i < length; i++) {
            a[i] = a[i] + a[i - 1];
        }

        for (int i = 1; i < length - 1; i++) {
            if (a[length - 1] - a[i] == a[i - 1]) {
                return true;
            }
        }
        if (a[length - 1] - a[0] == 0) return true;

        return false;
    }
}
