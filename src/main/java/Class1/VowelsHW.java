package Class1;

public class VowelsHW {
    String vwls;

    public String vowels(String input) {
        String vwls=input.replaceAll("[^aeiou]","");
        return vwls;
    }
    public static void main(String[] args) {
        VowelsHW find=new VowelsHW();
        String input=find.vowels("accomplished");
        System.out.println(input);
    }
}



