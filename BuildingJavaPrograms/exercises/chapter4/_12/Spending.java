package exercises.chapter4._12;

import java.util.Scanner;

public class Spending {
    public static void main(String[] args){
        int numBills = 0;
        System.out.println("How much will John be spending? ");
        numBills = spending(numBills);
        System.out.println("John needs " + numBills + " bills");
        System.out.println("How much will Jane be spending? ");
        numBills = spending(numBills);
        System.out.println("Jane needs " + numBills + " bills");
    }
    public static int spending(int numBills){
        Scanner console = new Scanner(System.in);
        double amount = console.nextDouble();
        System.out.println();
        numBills = (int) (amount / 20.0);
        if (numBills * 20.0 < amount){
            numBills++;
        }
        return numBills;
    }
}
