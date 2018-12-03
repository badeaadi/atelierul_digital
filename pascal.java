package com.company;
import java.io.*;
import java.util.ArrayList;

public class pascal {
    public static void main(String [] args) {
        int [][] matrix = new int [100][100];
        int i, j;
        for (i = 1; i < 10 ; i++)
            for (j = 1; j < 10 ; j++)
                if (i == 1 || j == i)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];

        for (i = 1; i< 10; i++) {
            for (j = 1; j <= i ; j++)
                System.out.print(matrix[i][j]+ " ");
            System.out.println();
        }
    }
}
