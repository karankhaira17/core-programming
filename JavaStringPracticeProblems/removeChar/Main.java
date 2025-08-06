import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char toRemove = sc.next().charAt(0);
        String result = input.replace(Character.toString(toRemove), "");
        System.out.println("Modified String: " + result);
    }
}
