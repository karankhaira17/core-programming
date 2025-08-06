import java.util.Scanner;

public class Main {
    public static void calculateRounds() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 in meters: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 in meters: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 in meters: ");
        double c = sc.nextDouble();
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 kilometers");
    }

    public static void main(String[] args) {
        calculateRounds();
    }
}
