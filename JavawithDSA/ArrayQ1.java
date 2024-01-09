package JavawithDSA;

import java.util.Scanner;

//Take an array as input from user. Search for a given number x and print the index at which it occurs
public class ArrayQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num =new int[size];

        //input
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int x =sc.nextInt();

        for(int i=0;i< num.length;i++){
           if(num[i]==x){
               System.out.println("x found at index"+i);
           }
        }

    }
}
