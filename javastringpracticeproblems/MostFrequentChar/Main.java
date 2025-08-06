import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int max = 0;
        char mostFreq = ' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) count++;
            }
            if (count > max) {
                max = count;
                mostFreq = ch;
            }
        }
        System.out.println("Most frequent character: '" + mostFreq + "'");
    }
}
