package week1.hw;

import java.util.Scanner;

public class StudentsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
    System.out.println("Enter number of Students:");
    int n=scan.nextInt();
    for(int i=1;i<=n;i++)
    {
    	System.out.print("Enter the name: ");
    	String nameOne=scan.nextLine();
    	System.out.print("Age");
    	int age=scan.nextInt();
    	System.out.print("Height: ");
    	int height=scan.nextInt();
    	System.out.print("Weight: ");
    	int weight=scan.nextInt();
    	System.out.println("////////////////////////////////////");
    		
    }
	}

}
