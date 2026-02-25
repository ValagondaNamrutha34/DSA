class Person {
    private int age;

    public void setAge(int a) {
        if (a >= 0) {
            age = a;
        }
    }

    // Getter
    public int getAge() {
        return age;
    }
}

class Setter {
    public static void main(String[] args) {
        Person ob = new Person();

        ob.setAge(25);   
        ob.setAge(-5);

        System.out.println(ob.getAge());
    }
}