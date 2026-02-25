class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    String name;

    // ✅ REQUIRED constructor
    Dog(String name) {
        super(); // must be first line
        this.name = name;
        System.out.println("Dog created: " + name);
    }
}

public class Animal4 {
    public static void main(String[] args) {
        Dog d = new Dog("buddy");
    }
}