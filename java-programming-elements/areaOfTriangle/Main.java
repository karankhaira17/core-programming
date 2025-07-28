import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base in cm: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height in cm: ");
        float height = sc.nextFloat();
        float areaCm = 0.5f * base * height;
        float areaIn = areaCm / (2.54f * 2.54f);
        System.out.println("The Area of the triangle in sq inches is " + areaIn + " and sq cm is " + areaCm);
    }
}
