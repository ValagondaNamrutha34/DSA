class User {

    private String name;
    private String role;

    // 🔒 Private constructor
    private User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // ✅ Static factory method
    public static User createAdmin(String name) {
        return new User(name, "admin");
    }

    // Method to display user details
    public void display() {
        System.out.println("Details of created user:");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }

    public static void main(String[] args) {
        User u = User.createAdmin("Alice");

        u.display();
    }
}