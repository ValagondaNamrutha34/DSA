class Snode {
    int data;
    Snode link;
}

class Basic12 {

    Snode head;
    int length;

    void addFirst(int value) {
        Snode newNode = new Snode();   // missing semicolon fixed
        newNode.data = value;

        if (head == null) {
            head = newNode;
        } else {
            newNode.link = head;
            head = newNode;
        }
    }

    void addLast(int value) {
        Snode newNode = new Snode();
        newNode.data = value;

        if (head == null) {   // important check
            head = newNode;
            return;
        }

        Snode temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    void addPos(int pos, int value) {
        if (pos < 0 || pos > len()) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            addFirst(value);
            return;
        }

        Snode newNode = new Snode();
        newNode.data = value;

        Snode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.link;
        }

        newNode.link = temp.link;
        temp.link = newNode;
    }

    int len() {
        Snode temp = head;
        length = 0;

        while (temp != null) {
            length++;
            temp = temp.link;
        }
        return length;
    }

    void display() {
        Snode temp = head;
        while (temp != null) {
            System.out.println(temp.data);   // corrected syntax
            temp = temp.link;               // missing semicolon fixed
        }
    }

    public static void main(String[] args) {
        Basic12 ob = new Basic12();

        ob.addFirst(10);
        ob.addFirst(20);
        ob.addLast(30);
        ob.addPos(3, 5);

        ob.display();
        System.out.println("Len = " + ob.len());
    }
}
