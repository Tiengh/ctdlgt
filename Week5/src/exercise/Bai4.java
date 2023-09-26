package exercise;

import edu.princeton.cs.algs4.StdIn;

public class Bai4 {
    public static void selectionSort(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] ar) {
        long start = System.currentTimeMillis();

        int n = StdIn.readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readInt();
        }
        selectionSort(n, a);
        for (Integer i : a) {
            System.out.print(i + " ");
        }

        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
