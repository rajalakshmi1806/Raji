package dailychallenge1;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
	    System.out.print("Enter Number#1:");
		int table=scan.nextInt();
		System.out.print("Enter Number#2:");
		int row=scan.nextInt();
		for(int i=1;i<=row;i++)
		{
		System.out.println(i+"*"+table+"="+(i*table));
		}

	}

}
