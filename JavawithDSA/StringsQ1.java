package JavawithDSA;

import java.util.Scanner;

//Take an array of strings input from the user & find the cumulative(combined) length of all those strings
public class StringsQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String array[]= new String[size];
        int totLenght=0;

        for(int i=0;i<size;i++){
            array[i]=sc.nextLine();
            totLenght+=array[i].length();
        }
        System.out.println(totLenght);
    }
}
