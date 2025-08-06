import java.util.Scanner;
public class Main {
    public static void calculateHandshakes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes + " among " + n + " students");
    }

    public static void main(String[] args) {
        calculateHandshakes();
    }
}
