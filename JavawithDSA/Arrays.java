package JavawithDSA;

public class Arrays {
    public static void main(String[] args) {
        int marks[]= new int[3];                //dynamic allocation
//        int mark[]= {85,63,74};               //static allocation
        marks[0]=97;  //phy
        marks[1]=98;  //chem
        marks[2]=95;  //eng
//        System.out.println(marks);          //garbage value
        System.out.println(marks[0]);

        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }

        int mark[]= {85,63,74};
    }
}
