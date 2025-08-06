import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) longest = words[i];
        }
        System.out.println("Longest word: " + longest);
    }
}
