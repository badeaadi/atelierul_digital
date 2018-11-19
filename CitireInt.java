import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static void main(String [] args) throws FileNotFoundException
    {

        int[] data= new int[10];

        Scanner fin= new Scanner(new BufferedReader( new FileReader("date.in")));

        int i;+
        for (i = 0 ; i < 10 ; i++)
            data[i]=fin.nextInt();

        for (i = 0 ; i < 10 ; i++)
            System.out.print(data[i]);

    }

}
