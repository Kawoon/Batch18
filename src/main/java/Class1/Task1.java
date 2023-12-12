package Class1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner find = new Scanner(System.in);
        System.out.println("How long it has been you are working here?");
        int years= find.nextInt();
        if (years>5)
            System.out.println("You are Eligible for the Bonus!");
        System.out.println("How much is your Annual Salary?");
        int salary=find.nextInt();
        if (salary>50000){
            System.out.println("You will get 5000 bonus");
        }else{
            System.out.println("Your bonus will be 3000");
        }
        }


    }