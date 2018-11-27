import java.util.*;
import java.io.*;




public class Leaders {
    public static void main(String[] args) {

        Scanner fin= new Scanner(System.in);
        List <Integer> myList = new ArrayList<>();
        List <Integer> IndexofSol = new ArrayList<>();

        int n = fin.nextInt();
        for (int i = 0; i < n ; i++) {
            int val = fin.nextInt();
            myList.add(val);
        }
        int maxim = myList.get(n-1);
        IndexofSol.add(n-1);

        for (int i = n-1 ; i >= 0; i--) {
            if (myList.get(i) > maxim) {
                IndexofSol.add(i);
                if (myList.get(i)> maxim)
                    maxim =  myList.get(i);
            }

        }
        int i=0; int j = IndexofSol.size() -1;

        for (; i<j; i++, j--) {
            int aux = IndexofSol.get(i);
            IndexofSol.set(i,IndexofSol.get(j));
            IndexofSol.set(j,aux);
        }
        System.out.println((IndexofSol.size())+ " leaders in the array");
    }
}