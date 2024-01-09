package Exercises;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle
public class Q4 {
    public static void circumOfCircle(double r){
        double c= 2*3.14*r ;
        System.out.println("Circumference of a circle is: "+c);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextInt();

        circumOfCircle(r);

    }
}
