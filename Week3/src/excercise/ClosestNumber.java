package excercise;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ClosestNumber {
    public static void main(String[] args){
        int n = StdIn.readInt();
        Vector<Integer> a = new Vector<>();
        for(int i = 0;i<n;i++){
            a.add(StdIn.readInt());
        }

        for(Integer x : closestNumbers(a)){
            System.out.print(x + " ");
        }
    }
    //Không nhất thiết phải dùng vector nhưng đây là theo yêu cầu đề bài
    public static Vector<Integer> closestNumbers(Vector<Integer> a){
        Collections.sort(a);

        if(a.size()<=2) return a;

        Vector<Integer> y = new Vector<>();

        int min = a.get(1)-a.get(0);
        for(int i = 0;i<a.size()-1;i++){
            if(a.get(i+1)-a.get(i)<min){
                min = a.get(i+1)-a.get(i);
            }
        }
        for(int i = 0;i<a.size()-1;i++){
            if(a.get(i+1)-a.get(i)==min){
                y.add(a.get(i));
                y.add(a.get(i+1));
            }
        }
        return y;
    }
}
