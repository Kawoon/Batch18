package Class1;

public class E1StringDemo {
    public static void main(String[] args) {
        String str=new String("Hello");
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str.concat(" "+"Asghar Sir"));
        System.out.println(str+" "+"Asghar Sir");
    }
}
