package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to print the middle column of an array:
    Scanner sc = new Scanner(System.in);
    int am[][] = new int[3][3];
    for(int i=0;i<3;i++){
    for (int j=0;j<3;j++){
        am[i][j] = sc.nextInt();
    }
    }
    // for middle row in 3x3 matrix the column name should be 1 so:
        int k =1;
    for (int i=0;i<3;i++){
        System.out.println(am[i][k]);
    }




    }
}
