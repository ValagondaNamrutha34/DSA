class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        this(10);         
        System.out.println("B");
    }

    B(int i) {
        super(); 
        System.out.println("B");          
    }
}

public class s {
    public static void main(String[] args) {
        B ob=new B();
    }
}