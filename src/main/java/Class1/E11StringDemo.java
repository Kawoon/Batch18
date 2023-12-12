package Class1;

public class E11StringDemo {
    public static void main(String[] args) {
        String str="It's savera's birthday today. it's Sunday . Today is java class";
        String [] strArr=str.split("[.]");
        System.out.println(strArr[1].trim());
    }
}
