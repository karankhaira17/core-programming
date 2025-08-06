import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine().toLowerCase();
        String vowels = "aeiou";
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.contains(ch + "")) v++;
                else c++;
            }
        }
        System.out.println("Vowels:" + v + " Consonants:" + c);
    }
}
