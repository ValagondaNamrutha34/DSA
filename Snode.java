class Snode {
    int data;
    Snode link;
}

public class Void {

    Snode head;

    // Method to calculate length
    int len() {
        int count = 0;
        Snode temp = head;

        while (temp != null) {
            count++;
            temp = temp.link;
        }

        return count;
    }

    // Method to update value at given position
    void update2(int pos, int value) {

        if (pos < 0 || pos >= len()) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            head.data = value;
        } else {
            Snode temp = head;

            while (pos > 1) {
                temp = temp.link;
                pos--;
            }

            temp.link.data = value;
        }
    }

    // Helper method to add node at end
    void addLast(int value) {
        Snode newNode = new Snode();
        newNode.data = value;

        if (head == null) {
            head = newNode;
        } else {
            Snode temp = head;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    // Display list
    void display() {
        Snode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        Void obj = new Void();

        obj.addLast(10);
        obj.addLast(20);
        obj.addLast(30);
        obj.addLast(40);

        System.out.println("Before update:");
        obj.display();

        obj.update2(2, 99);

        System.out.println("After update:");
        obj.display();
    }
}
