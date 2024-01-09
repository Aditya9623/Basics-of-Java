package Exercises;

import java.util.Scanner;

// Enter 3 numbers from the user & make a function to print their average
public class Q1 {
    public static void Average(int a,int b,int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid number\nEnter Positive numbers only");
            return;
        }
        int avg = (a+b+c)/3;
        System.out.println(avg);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average(a,b,c);
    }
}
