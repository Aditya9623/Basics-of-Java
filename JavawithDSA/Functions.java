package JavawithDSA;


import java.util.Scanner;

public class Functions {
    public static void printMyName(String name){                    //declare function
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name);     //call function
    }
}
