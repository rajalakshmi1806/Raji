package week1.hw;
import java.util.Scanner;
public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value:");
		int a=scan.nextInt();
		System.out.print("Enter the value:");
		int b=scan.nextInt();
		System.out.println(a>>b);
		System.out.println(a<<b);
		System.out.println(a==b);
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a>>>b);
		System.out.println(~b);
		

	}

}
