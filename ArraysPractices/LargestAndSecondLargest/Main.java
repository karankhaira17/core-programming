import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digit = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int num = number % 10;
            digit[index] = num;
            index++;
            number = number / 10;
            if (index == maxDigit) {
                break;
            }
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digit[i] > largest) {
                secondLargest = largest;
                largest = digit[i];
            } else if (digit[i] > secondLargest && digit[i] != largest) {
                secondLargest = digit[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);
    }
}
