package Class1;

public class ReverseHW {
    String input;
    public static String reversing(String input){
        String rev="";
        for (int k=input.length()-1;k>=0;k--){
            rev=rev+input.charAt(k);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reversing("Happy Birthday"));


    }
}
