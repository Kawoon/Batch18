package Class1;

public class AccessModifiersHomeWork {
    public static String reverse(String input){
        String rever="";
        for(int k=input.length()-1;k>0;k--){
            rever=rever+input.charAt(k);
        }
        return rever;
    }
}
