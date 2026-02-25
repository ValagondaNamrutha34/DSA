class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        // call parent class method
        super.speak();
        // child class behavior
        System.out.println("Dog barks");
    }
}

public class A1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
    }
}