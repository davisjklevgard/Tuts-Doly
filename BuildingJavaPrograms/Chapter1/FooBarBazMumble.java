package Chapter1;
/*
this program shows method calls within other methods
 */
public class FooBarBazMumble {
    public static void main(String[] args) {
        foo();
        bar();
        System.out.println("mumble");
    }

    public static void foo() {
        System.out.println("foo");
    }
    //this procedural-style method calls baz method inside it and prints the word bar to the console
    public static void bar() {
        baz();
        System.out.println("bar");
    }

    public static void baz() {
        System.out.println("baz");
    }
}
