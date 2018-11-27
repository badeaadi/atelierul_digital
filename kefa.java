//package com.company;
import java.io.*;
import java.util.*;
import java.util.Arrays;

public class kefa {

    int money;
    int factor;

    public kefa(int theMoney, int theFactor) {
        this.money = theMoney;
        this.factor = theFactor;
    }
    //@Override
    public int getMoney() {
        return this.money;
    }
    public int getFactor() {
        return this.factor;
    }
    public int compareTo(kefa other ) {

        return Integer.compare(this.money, other.money);
    }

    public static void main(String [] args) throws FileNotFoundException
    {
        //Scanner fin= new Scanner(new BufferedReader(new FileReader("date.in")));
        Scanner fin= new Scanner(System.in);
        int i, money, factor;
        int n = fin.nextInt();
        int d = fin.nextInt();

        List <kefa> MyList = new ArrayList<kefa>();
        for (i = 0 ; i < n; i++) {
            money  = fin.nextInt();
            factor = fin.nextInt();

            kefa fr = new kefa(money, factor);
            MyList.add(fr);
        }
        MyList.sort(kefa::compareTo);
        int j=0;
        long s[] = new long [100005];
        long answer=0,anspart;

        s[0]=MyList.get(0).getFactor();

        for (i=1; i< MyList.size();i++)
            s[i] = s[i-1] + MyList.get(i).getFactor();

        for (i=0; i< MyList.size();i++) {
            //System.out.println(MyList.get(i).getMoney());
            while (j+1<MyList.size()&&MyList.get(j+1).getMoney()-MyList.get(i).getMoney()<d)
                j++;
            if (i==0)
                anspart=s[j];
            else
                anspart=s[j]-s[i-1];
            if (anspart> answer)
                answer=anspart;
        }
        System.out.println(answer);
    }

}