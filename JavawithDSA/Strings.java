package JavawithDSA;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String declaration
//        String name = "aditya";
//        String fullname = "Aditya Vishwakarma";
//        String sentence="My name is adi";

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Your name is: "+name);

        //concatenation
/*        String firstname="Aditya";
        String lastname="Vishwakarma";
        String fullname=firstname+ " " +lastname;

        System.out.println(fullname.length());       //prints the lenght of string

        //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
*/
        //compare
        String name1="Adi";
        String name2="Adi";

        //1 s1>s2 : +ve value
        //2 s1==s2 : 0
        //3 s1<s2 : -ve value

/*        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("not equal");
        }
*/
/*        if(name1==name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("not equal");
        }
*/
/*        if(new String("Adi")==new String("Adi")){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
*/
        //substring(beg index, end index)
        String sentence = "My name is Adi";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);


        //Strings are immutable, means non-changable
    }
}
