import java.util.Scanner;

public class toggle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            else {
                result = result + ch;
            }
        }

        System.out.println("Output: " + result);
    }
}