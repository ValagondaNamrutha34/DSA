interface Laptop1 {
    default void display() {
        System.out.println("abs");
    }

    void print();
}

interface Laptop2 {
    void print1();
}

class A {
}

public class Basic extends A implements Laptop1, Laptop2 {

    public void print() {
        System.out.println("basic");
    }

    public void print1() {
        // no output needed
    }

    public static void main(String[] args) {
        Basic b = new Basic();
        b.print();     // basic
        b.display();   // abs
    }
}