package Class1;

public class E6Concat {
    public static void main(String[] args) {
                String firstWord ="Merry";
                String secondWord ="Christmas!";

                System.out.println("Before swap: firstWord= " +firstWord+ ",secondWord=" +secondWord);

                firstWord=firstWord+secondWord;

                secondWord=firstWord.substring(0,firstWord.length()-secondWord.length());

                firstWord=firstWord.substring(secondWord.length());

                System.out.println();

                System.out.println("After swap:firstWord="+firstWord+",secondWord="+secondWord);
            }
        }

