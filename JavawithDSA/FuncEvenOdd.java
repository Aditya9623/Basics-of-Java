package JavawithDSA;

import java.util.Scanner;

public class FuncEvenOdd {
    public static void EvenOdd(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        if(n%2==0){
            System.out.println("The no is even");
        }else {
            System.out.println("The no is Odd");
        }
        return ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        EvenOdd(n);
    }
}
