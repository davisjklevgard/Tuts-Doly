package exercises.chapter4._5;

public class ifElseMystery1 {
    public static void ifElseMystery1(int x, int y) {
        int z = 4;
        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 9;
        }
        if (z <= y) {
            y++;
        }
        System.out.println(z + " " + y);
    }
    //a (3, 20)  answer: 13 21
    //b (4, 5)   answer: 5 6
    //c (5, 5)   answer: 6 6
    //d (6, 10)  answer: 7 11

}
