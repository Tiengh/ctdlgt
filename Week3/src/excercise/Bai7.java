package excercise;

import edu.princeton.cs.algs4.In;

import static java.util.Arrays.sort;

public class Bai7 {
    public static void main(String[] args) {
        In in = new In("D:\\algs4-data\\8Kints.txt");

        int[] arr = in.readAllInts();
        ThreeSum(arr);
    }

    public static void ThreeSum(int[] arr) {
        sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == 0) {
                    System.out.println(arr[i] + " " + arr[l] + " " + arr[r]);
                    l++;
                    r--;
                } else if (arr[i] + arr[l] + arr[r] < 0) {
                    l++;
                } else if (arr[i] + arr[l] + arr[r] > 0) {
                    r--;
                }
            }
        }
    }
}
