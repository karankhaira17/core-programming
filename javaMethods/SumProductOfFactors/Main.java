import java.util.Scanner;

public class Main {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int n : arr) p *= n;
        return p;
    }
    public static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int n : arr) s += (int)Math.pow(n, 2);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.print("The factors are: ");
        for (int n : factors) System.out.print(n + " ");
        System.out.println();
        System.out.println("The sum of factors is " + sum(factors));
        System.out.println("The product of factors is " + product(factors));
        System.out.println("The sum of square of factors is " + sumOfSquares(factors));
    }
}
