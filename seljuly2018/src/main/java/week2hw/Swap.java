package week2hw;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers:");
		int numberOne=scan.nextInt();
		int numberTwo=scan.nextInt();
		System.out.printf("Numbers before swapping :\n"+numberOne + "\n"+numberTwo + "\n");
		temp=numberOne;
		numberOne=numberTwo;
		numberTwo=temp;
		System.out.printf("Numbers after Swapping:\n" +numberOne+ "\n" + numberTwo);

	}

}
