package Class1;

import java.util.Scanner;

public class LogicalOperators {
        public static void main(String[] args) {
                Scanner find=new Scanner(System.in);
                System.out.println("Enter your height in inches");
                double hgt=find.nextDouble();
                if (hgt<60){
                        System.out.println("ShorT");
                }else if (hgt>60 || hgt<72){
                        System.out.println("Medium");
                }else if (hgt>72){
                        System.out.println("TaLL");
                }
        }

        }
