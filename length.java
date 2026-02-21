import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // corrected 'canner' to 'Scanner'
        
        String s = "";                         // better initialization
        StringBuilder sb = new StringBuilder();
        
        System.out.println(s.length());        // 0
        System.out.println(sb.length());       // 0
        System.out.println(sb.length());       // 0
        
        s = "laptop";
        s = s + s;                            
        
        sb.append("11223344556677889");
        
        System.out.println(sb);
        System.out.println(s.length());
        System.out.println(sb.capacity());
        
        sc.close(); // good practice
    }
}