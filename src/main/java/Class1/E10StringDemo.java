package Class1;

public class E10StringDemo {
    public static void main(String[] args) {
        String str="asds   f##$^$%^  APLKGF";
        System.out.println(str.replaceAll("[a-z]","%"));
        System.out.println(str.replaceAll("[A-Z]","%"));
        System.out.println(str.replaceAll("[A-Za-z]","%"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","%"));
        System.out.println(str.replaceAll("[^A-Z]","%"));
        System.out.println(str.replaceAll("[^A-Za-z]","%"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","%"));
        System.out.println(str.replaceAll("[#-*]",""));
        System.out.println(str.replaceAll("[\\s]",""));
        System.out.println(str.replaceAll("[\\d]",""));

    }
}
