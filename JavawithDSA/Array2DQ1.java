package JavawithDSA;

import java.util.Scanner;

//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs
public class Array2DQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int num[][]=new int[rows][cols];

        //input
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                num[i][j]=sc.nextInt();
            }
        }

        int x =sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(num[i][j]==x){
                    System.out.println("x found at location: "+i+","+j);
                }
            }
        }

    }
}
