package exercises.chapter4._11;

import java.util.Scanner;

public class Contribution {
    public static void main(String[] args){


        int sum = 1000;
        Scanner console = new Scanner(System.in);
        System.out.print("Is your money multipled 1 or 2 times ");
        int times = console.nextInt();
        if (times == 1){
            System.out.println("And how much are you contributing?");
            int donation = console.nextInt();
            sum = sum + donation;
            int count1;
            count1++;

            total = total + donation;

        } else if (times == 2){
            contributing();
            int donation = 0;
            sum = sum + donation;

        } else{
            System.out.println("Oh! Then you will be contributing later tonight.");
        }

    }
    
    public static int contributing(){
        int sum = 1000;
        System.out.println("And how much are you contributing?");
        Scanner console = new Scanner(System.in);
        int donation = console.nextInt();

    } return donation;
}
