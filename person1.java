class Person {
    private int age = 0; 

  
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        
    }

    
    public int getAge() {
        return age;
    }
}

public class person1 {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("Initial age:" + p.getAge());

        p.setAge(25);
        System.out.println("After setAge(25):" + p.getAge());

        p.setAge(-5);
        System.out.println("After setAge(-5):" + p.getAge());
    }
}