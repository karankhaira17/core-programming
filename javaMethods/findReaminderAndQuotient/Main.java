import java.util.Scanner;

public class Main {
    public static int[] remainderQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        int[] result = remainderQuotient(number, divisor);
        int remainder = result[0];
        int quotient = result[1];
        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder);
    }
}
