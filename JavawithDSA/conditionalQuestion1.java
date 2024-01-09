package JavawithDSA;

import java.util.Scanner;
//button
public class conditionalQuestion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
//using if-else
/*        if(button==1){
            System.out.println("Hello");
        }else if (button==2){
            System.out.println("Namaste");
        }else if(button==3){
            System.out.println("Kaisan baa");
        }else {
            System.out.println("Invalid button");
        }
*/
        //Switch case
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Kaisan baa");
                break;
            default:
                System.out.println("Invalid button");
        }

    }
}
