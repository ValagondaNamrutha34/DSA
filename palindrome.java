import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.nextLine();

        String original = str;
        str = str.toLowerCase();   // ignore case

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println(original + " is Palindrome");
        } else {
            System.out.println(original + " is Not Palindrome");
        }
    }
}