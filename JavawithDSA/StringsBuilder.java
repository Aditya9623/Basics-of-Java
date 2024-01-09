package JavawithDSA;

public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Adi");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);
        //insert
        sb.insert(1,'o');
        System.out.println(sb);

        //delete
        sb.delete(1,2);
        System.out.println(sb);
    }
}
