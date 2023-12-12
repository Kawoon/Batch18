package Class1;

public class EmailTester {
    public static void main(String[] args) {
        Email add=new Email();
      String str=add.createEmail("John","Snow","@gmail.com");
        System.out.println(str);
    }
}
