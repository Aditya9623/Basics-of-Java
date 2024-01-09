package Exercises;

import java.util.Scanner;

//Write a function that takes in age as input and returns if that is eligible to vote or not.
//A person of age>18 is eligible to vote
public class Q5 {
    public static void vote(int age){
        if(age>18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of candidate: ");
        int age = sc.nextInt();

        vote(age);

    }
}
