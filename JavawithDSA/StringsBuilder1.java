package JavawithDSA;

public class StringsBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");      //if we write in string: str=str+"e";
        sb.append("l");                             //str=str+"l"; ......
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
