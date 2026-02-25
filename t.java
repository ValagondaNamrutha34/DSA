class Parent {
    void who() {
        System.out.print("Parent");
    }
}

class Child extends Parent {

    @Override
    void who() {
        System.out.print("Child");
    }

    void test() {
        this.who();   // Calls Child's print()
        super.who();  // Calls Parent's print()
    }

}

public class t {   // ✅ renamed (not keyword)

    public static void main(String[] args) {
        Child ob=new Child();
        ob.test();
}
}