package JavawithDSA;

import java.util.Scanner;

public class LoopsQuestion1 {
    public static void main(String[] args) {
/*        //Print the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
*/
        //Print the table of a number input by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}
