import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.print("Enter number :");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            int n = num[i];
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println("Number " + n + " is positive and even.");
                } else {
                    System.out.println("Number " + n + " is positive and odd.");
                }
            } else if (n < 0) {
                System.out.println("Number " + n + " is negative.");
            } else {
                System.out.println("Number is zero.");
            }
        }
        if (num[0] == num[4]) {
            System.out.println("First and last elements are equal.");
        } else if (num[0] > num[4]) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
    }
}
