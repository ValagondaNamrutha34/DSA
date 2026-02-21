import java.util.Scanner;

public class ReplaceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Replace "iss" with "ox"
        String result = str.replace("iss", "ox");
        
        System.out.println("Output: " + result);
    }
}