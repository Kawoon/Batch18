package Class1;

public class E7StringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";
        int index=0;
      for (int k=0;k<str.length();k++){
         if(str.charAt(k)=='a'){
             index++;
             System.out.println(k);
         }
        }
    }
}
