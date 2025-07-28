import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the perimeter :");
        float perimeter =sc.nextFloat();
        float side = perimeter/4;
        System.out.println("length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
