class Dnode {

    int data;
    Dnode left;
    Dnode right;
}

public class Basic14 {

    Dnode head;
    Dnode tail;
    int length;

    // Add first
    void addFirst(int value) {

        Dnode newNode = new Dnode();
        newNode.data = value;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.right = head;
            head.left = newNode;
            head = newNode;
        }
    }

    // Add last
    void addLast(int value) {

        Dnode newNode = new Dnode();
        newNode.data = value;

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.right = newNode;
            newNode.left = tail;
            tail = newNode;
        }
    }

    // Add at position
    void addPos(int pos, int value) {

        if (pos < 0 || pos > len()) {
            System.out.println("invalid position");
            return;
        }

        if (pos == 0) {
            addFirst(value);
        } 
        else if (pos == len()) {
            addLast(value);
        } 
        else {
            Dnode newNode = new Dnode();
            newNode.data = value;

            Dnode temp = head;
            while (pos > 1) {
                temp = temp.right;
                pos--;
            }

            newNode.right = temp.right;
            newNode.left = temp;
            temp.right.left = newNode;
            temp.right = newNode;
        }
    }

    // Delete first
    void deleteFirst() {

        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.right;
            head.left = null;
        }
    }

    // Delete last
    void deleteLast() {

        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.left;
            tail.right = null;
        }
    }

    // Delete at position
    void deletePos(int pos) {

        if (pos < 0 || pos >= len()) {
            System.out.println("invalid position");
            return;
        }

        if (pos == 0) {
            deleteFirst();
        } 
        else if (pos == len() - 1) {
            deleteLast();
        } 
        else {
            Dnode temp = head;
            while (pos > 1) {
                temp = temp.right;
                pos--;
            }

            temp.right = temp.right.right;
            temp.right.left = temp;
        }
    }

    // Update by value
    void update(int target, int value) {

        Dnode temp = head;

        while (temp != null) {
            if (temp.data == target) {
                temp.data = value;
            }
            temp = temp.right;
        }
    }

    // Update by position
    void update2(int pos, int value) {

        if (pos < 0 || pos >= len()) {
            System.out.println("invalid position");
            return;
        }

        Dnode temp = head;
        while (pos > 0) {
            temp = temp.right;
            pos--;
        }

        temp.data = value;
    }

    // Length
    int len() {

        Dnode temp = head;
        length = 0;

        while (temp != null) {
            length++;
            temp = temp.right;
        }

        return length;
    }

    // Display forward
    void display() {

        Dnode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.right;
        }
        System.out.println("null (forward)");
    }

    // Display reverse
    void reverse() {

        Dnode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.left;
        }
        System.out.println("null (reverse)");
    }

    // Contains
    boolean contains(int target) {

        Dnode temp = head;
        while (temp != null) {
            if (temp.data == target)
                return true;
            temp = temp.right;
        }
        return false;
    }

    public static void main(String[] args) {

        Basic14 ob = new Basic14();

        ob.addFirst(10);
        ob.addFirst(20);
        ob.addLast(30);
        ob.addPos(3, 5);

        ob.update(10, 50);
        ob.update2(0, 80);

        System.out.println(ob.contains(30));

        ob.display();
        ob.reverse();

        System.out.println("Len = " + ob.len());
    }
}
