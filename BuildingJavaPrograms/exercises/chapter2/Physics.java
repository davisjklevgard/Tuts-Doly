package exercises.chapter2;

public class Physics {
    public static void main(String[] args){
        double so = 0;
        double t = 20;
        double vo = 3.6;
        double a = vo / t;
        double p = so + vo * t + t * (.5 *a * t);
        System.out.print(p);
    }
}
