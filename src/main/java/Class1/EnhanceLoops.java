package Class1;

public class EnhanceLoops {
    public static void main(String[] args) {
        int [] nmbs={10,15,20,18,9,60,22,30};
        int sumOdd=0;
        int sumEven=0;
        for(int k:nmbs) {
            if (k%2!= 0) {
                sumOdd = sumOdd + k;
            }


                if (k % 2 == 0){
                sumEven = sumEven + k;

            }
        }
        System.out.println("sum of odd is" + " " + sumOdd);
        System.out.println("sum of even is" + " " + sumEven);
    }

    }

