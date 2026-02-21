import java.util.Scanner;

public class CommaSeparatedWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();   // Read full line

        String[] words = input.split(" ");  // Split by space

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            sb.append(words[i]);

            if (i < words.length - 1) {
                sb.append(",");
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }
}