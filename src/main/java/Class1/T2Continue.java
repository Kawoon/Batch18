package Class1;

import java.util.Scanner;

public class T2Continue {
    public static void main(String[] args) {
        int[] nmbs=new int[5];
        Scanner Scan=new Scanner(System.in);
        for(int k=0;k<nmbs.length;k++){
            System.out.println("PLease enter number "+(k+1));
            nmbs[k]=Scan.nextInt();
        }
        System.out.println("Here are the number that you have entered");
        }
    }

