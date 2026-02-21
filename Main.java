import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result = result + Character.toUpperCase(str.charAt(i));
        }

        System.out.println("Output: " + result);
    }
}