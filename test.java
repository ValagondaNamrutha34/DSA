class Test {
    final int ID;

    Test() {
        ID = 100;
    }

    void show() {
        System.out.println(ID);
    }

    public static void main(String[] args) {
        Test ob = new Test();
        ob.show();
    }
}