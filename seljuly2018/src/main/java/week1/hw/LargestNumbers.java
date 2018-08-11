package week1.hw;
import java.util.Scanner;

public class LargestNumbers {
	public static void main(String[] args) {
	System.out.println("Enter the numbers: ");
    Scanner scan=new Scanner(System.in);
	int numberOne=scan.nextInt();
	int numberTwo=scan.nextInt();
	int numberThree=scan.nextInt();
	System.out.println("The entered numbers are:");
	System.out.println(numberOne);
	System.out.println(numberTwo);
	System.out.println(numberThree);
	if((numberOne<numberTwo)&&(numberTwo>numberThree))
		System.out.println(numberTwo+ "is largest");
	if((numberOne>numberTwo)&&(numberTwo>numberThree))
	  System.out.println(numberOne +" is largest");
	
	else
		System.out.println(numberThree+ "is Largest");
}
}