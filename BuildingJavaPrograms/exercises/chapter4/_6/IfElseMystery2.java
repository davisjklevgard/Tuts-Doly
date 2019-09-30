package exercises.chapter4._6;

public class IfElseMystery2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        ifElseMystery2(a, b);
    }

        public static void ifElseMystery2 ( int a, int b){
            if (a * 2 < b) {
                a = a * 3;
            } else if (a > b) {
                b = b + 3;
            }
            if (b < a) {
                b++;
            } else {
                a--;
            }
            System.out.println(a + " " + b);
        }

        //a (10, 2)  Answer:10 6
        //b (3, 8)   Answer:9 9
        //c (4, 4)   Answer:3 4
        //d (10, 30) Answer29 30

    }
