import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in feet :");
		float feet =sc.nextFloat();
		float yard =feet/3;
		float mile =yard/1760;
		System.out.println("The distance in yards is :"+ yard +"while the distance in miles is :"+ mile);
	}
}
