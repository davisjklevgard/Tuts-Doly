package exercises.chapter4._9;

import java.util.Scanner;

public class FavoriteColor {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What is your favorite color? ");
        String name = console.next();
        if (name == "blue"){
            System.out.println("Mine, too!");
        } else{
            System.out.println("Mine is blue.");
        }
    }
}
