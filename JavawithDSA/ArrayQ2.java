package JavawithDSA;

import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen
public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[]= new String[size];

        for(int i=0;i<size;i++){
            name[i]= sc.nextLine();
        }
        for(int i=0;i< name.length;i++){
            System.out.println(name[i]);
        }
    }
}
