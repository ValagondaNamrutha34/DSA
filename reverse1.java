
import java.util.Scanner;

public class reverse1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        int lastSpace = str.lastIndexOf(" ");

        String firstPart = str.substring(0, lastSpace + 1);
        String lastWord = str.substring(lastSpace + 1);

        String reversedWord = "";

        for (int i = lastWord.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + lastWord.charAt(i);
        }

        System.out.println("Output: " + firstPart + reversedWord);
    }
}