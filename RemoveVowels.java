import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (vowels.indexOf(c) != -1) {
                sb.deleteCharAt(i);
                i--; // important after deletion
            }
        }

        System.out.println("After removing vowels: " + sb.toString());
        sc.close();
    }
}