package Class1;

public class SumHW {
        public int[] array;
        int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        public static void main(String[] args) {
            SumHW sm=new SumHW();
            int [] array={7,77,777};
            System.out.println(sm.calculateSum(array));

        }
        }

