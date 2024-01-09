package JavawithDSA;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

        //even and odd number

        Scanner sc1=new Scanner(System.in);
        int x = sc1.nextInt();

        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        */

        //a=b--->equal     a>b----->a is greater       a<b----->a is lesser
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        if(a==b){
            System.out.println("a and b are equal");
        } else if (a>b) {
            System.out.println("a is greater");
        }else{
            System.out.println("a is lesser");
        }

    }
}
