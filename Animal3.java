// Base class
class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inherits Animal
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

// Cat class inherits Animal
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Animal3 {
    public static void main(String[] args) {
        // Array of Animal type
        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();

        // Polymorphic behavior
        for (Animal a : animals) {
            a.speak();
        }
    }
}