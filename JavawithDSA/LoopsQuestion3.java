package JavawithDSA;

import java.util.Scanner;

//Make a menu-driven program. The user can enter 2 numbers, either 1 or 0
public class LoopsQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int input;

       do{
           int marks = sc.nextInt();
           if(marks >=90 && marks <=100){
               System.out.println("This is good marks");
           } else if (marks >= 60 && marks <=89) {
               System.out.println("This is also good");
           } else if (marks>=0 && marks<=50) {
               System.out.println("This is good as well");
           }else{
               System.out.println("Invalid");
           }
           System.out.println("Want to continue?  (yes(1) or no(0))");
           input = sc.nextInt();
       }while (input==1);

    }
}
