package Class1;

public class Task7 {
    int nmbs(int[] array) {
        int sum = 0;
        for (int k = 0; k < array.length; k++) {
            sum = sum + array[k];

        }
        return sum;
    }

    public static void main(String[] args) {
        Task7 add=new Task7();
        int[] numbers={12,43,56,76,78};
        int sum=add.nmbs(numbers);
        System.out.println(sum);


    }
}



