package exercise;

import edu.princeton.cs.algs4.*;

public class UFClient2 {
    public static void main(String[] args) {
        In in = new In("D:\\algs4-data\\tinyUF.txt");
        int  n = in.readInt();

        UF uf = new UF(n);
        int i = 0;
        while(!in.isEmpty()){
            int p = in.readInt();
            int q = in.readInt();
            i++;
            if(!uf.connected(p,q)){
               uf.union(p,q);
           }
            if(uf.count()==1) {System.out.println(i); break;}
        }

        if(uf.count()!=1) System.out.println("FAILED");
    }
}
