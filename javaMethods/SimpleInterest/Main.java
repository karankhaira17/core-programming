import java.util.Scanner;

public class Main {

    public static void calculateSimpleInterest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("The simple interest is " + interest +" for principal " + principal +
                           ", rate of interest " + rate + " and time " + time);
    }

    public static void main(String[] args) {
        calculateSimpleInterest();
    }
}
