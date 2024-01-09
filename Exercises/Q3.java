package Exercises;

import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two
public class Q3 {
    public static void greaterNum(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else {
            System.out.println(b+" is greater than "+a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNum(a,b);
    }
}
