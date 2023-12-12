package Tasks;

public class Practice {
    public static void main(String[] args) {
        double mPrice = 55000;
        double mRate = 3.7;
        if (mRate > 4.5) {
            System.out.println("User will not buy a House");

        } else {
            System.out.println("User will consider Buying");
            if (mPrice > 100000) {
                System.out.println("User will take a Loan");

            } else {
                System.out.println("User will pay Cash");
            }
        }
    }
}