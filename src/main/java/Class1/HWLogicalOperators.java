package Class1;

import java.util.Scanner;

public class
HWLogicalOperators {
    public static void main(String[] args) {
        Scanner find=new Scanner(System.in);
        System.out.println("Is it Weekend?");
        boolean wknd=find.nextBoolean();
        if(!wknd){
            System.out.println("Today you wil be learning manual Testing");
        }else{
            System.out.println("Today you will be learning Java");
        }
    }
}







