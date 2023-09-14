package excercise;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import edu.princeton.cs.algs4.*;

public class Bai2 {
    public static void main(String[] ar) {

        int n = StdIn.readInt();
        int[] a = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt();
        }
        Arrays.sort(a);
        System.out.println(binarySearch(a, 0));
    }

    public static int binarySearch(int[] a, int number) {
        int L = 0;
        int R = a.length - 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (a[mid] < number) {
                L = mid + 1;
            } else if (a[mid] > number) {
                R = mid - 1;
            } else return mid;
        }
        return -1;
    }
}
