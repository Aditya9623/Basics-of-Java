package JavawithDSA;

import java.util.Scanner;
//make a function to multiply 2 numbers and return the product
public class FuncQuestion2 {
    public static int Multiply(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(Multiply(a,b));

//        int mul=Multiply(a,b);
//        System.out.println("The product of 2 nos is: " +a+  "*"  +b+  ":"  +mul);

    }
}
