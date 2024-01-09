package JavawithDSA;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //Input
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);

        //nextInt() used for integer type input
        //nextFloat()   .....etc

        //Take 2 variables a & b and print their sum
        System.out.println("**************************************\n.");
        Scanner sc1=new Scanner(System.in);

        System.out.println("enter the first no");
        int a=sc1.nextInt();
        System.out.println("enter the second no");
        int b=sc1.nextInt();
        int sum=a+b;

        System.out.println("The sum of 2 nos is"+sum);
    }
}
