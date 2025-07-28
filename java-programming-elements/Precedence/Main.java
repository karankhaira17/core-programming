import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a :");
		float a=sc.nextFloat();
		System.out.println("Enter b :");
		float b=sc.nextFloat();
		System.out.println("Enter c :");
		float c= sc.nextFloat();
		System.out.println("a + b *c :"+(a+b*c)+ "\na * b + c :"+(a*b+c)+"\nc + a / b :"
		+(c+a/b)+ "\na % b + c :"+(a%b+c));
	}
}
