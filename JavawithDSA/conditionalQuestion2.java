package JavawithDSA;

import java.util.Scanner;
//calculator
public class conditionalQuestion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("********** MENU *************");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Reminder");

        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Addition is: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction is: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is: "+(a*b));
                break;
            case 4:
                if(b==0){
                    System.out.println("Invalid Number\nPlease enter valid number except 0");
                }else{
                    System.out.println("Division is: "+(a/b));
                }
                break;
            case 5:
                if(b==0){
                    System.out.println("Invalid number\nPlease enter valid number except 0");
                }else{
                    System.out.println("Reminder is: "+(a%b));
                }
                break;
            default:
                System.out.println("Please enter valid input");

        }
    }
}
