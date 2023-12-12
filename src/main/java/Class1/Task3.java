package Class1;

public class Task3 {
    public static void main(String[] args) {
        String str="Java is fun";
        int count=0;
     for(int k=0;k<str.length();k++){
         if(str.charAt(k)=='a'){
             count++;
         }
     }
        System.out.println(count);
    }
}
