import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float number1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float number2 = sc.nextFloat();
        float add = number1 + number2;
        float subtract = number1 - number2;
        float multiply = number1 * number2;
        float divide = number1 / number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is: " + add + ", " + subtract + ", " + multiply + ", and " + divide);
    }
}
