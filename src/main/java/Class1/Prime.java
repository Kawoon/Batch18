package Class1;

public class Prime {

    void isPrimeNo(int input) {
        int score = 0;
        for (int k = 1; k <= input; k++) {
            if (input % k == 0) {
                score++;
                    System.out.println(input + " " + "is not a Prime Number");
                    break;
                } else{
                    System.out.println(input + " " + "is a Prime Number");
                }
            }
        }
    }


















