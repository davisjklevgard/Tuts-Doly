package Chapter1;
/*
This program produces two boxes
 */
public class DrawBoxes2 {
    public static void main(String[] args) {
        //this statement calls a method to produce what is in the method
        drawBox();
        System.out.println();
        drawBox();
    }
    //this procedural-style method is named drawBox, does not return anything, but prints out a list of statements
    public static void drawBox() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
