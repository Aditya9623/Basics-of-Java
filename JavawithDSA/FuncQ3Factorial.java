package JavawithDSA;

import java.util.Scanner;

public class FuncQ3Factorial {
    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid number");
            return;
        }

        int fac = 1;
        for(int i=n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        printFactorial(n);
    }
}
