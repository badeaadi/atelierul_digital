package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class mergearrays {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader("date.in")));
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> myListn = new ArrayList<>();
        List<Integer> myListm = new ArrayList<>();

        int i, j, val;
        for (i = 1; i <= n; i++) {
            val = sc.nextInt();
            myListn.add(val);
        }
        for (i = 1; i <= m; i++) {
            val = sc.nextInt();
            myListm.add(val);
        }

        List<Integer> myList = new ArrayList<>();
        i = 0;
        j = 0;
        while (i < n || j < m) {
            if (i < n) {
                if (j < n) {
                    if (myListn.get(i) < myListm.get(j))
                        myList.add(myListn.get(i++));
                    else
                        myList.add(myListm.get(j++));
                } else
                    myList.add(myListn.get(i++));
            } else
                myList.add(myListm.get(j++));
        }
        for (i = 0; i< n+m; i++)
            System.out.println(myList.get(i));
    }
}
