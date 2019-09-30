package exercises.chapter4._7;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        evenOdd(x);
    }

    public static void evenOdd(int x){
        if (x % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
