package Exercises;

import java.util.Scanner;

//Two nos are entered by the user, x and n.
//Write a function to find the value of one number raised to the power of another i.e.x^n
public class Q8 {
    public static void raised(int x, int n){
        //int r = x^n;
        System.out.println(Math.pow(x,n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        raised(x,n);
    }
}
