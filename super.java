class Laptop {
    Laptop() {
        System.out.println("laptop");
    }
}

class Asus extends Laptop {
    Asus() {
        super();
        System.out.println("Asus");
    }
}

class Processor extends Asus {
    Processor() {
        super();
        System.out.println("Processor");
    }

    public static void main(String[] args) {
        Processor obj = new Processor();
    }
}