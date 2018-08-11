package dailychallenge1;
import java.util.Scanner;
public class AscendingOrder {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in) ;
		int temp;
		System.out.println("Enter the number of Elements");
		int n=scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
		 a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for(int i=0;i<n-1;i++)  //n-1 is used to reduce one itteration
		{                     
			System.out.print(a[i]+",");
		}
		System.out.println(a[n-1]);//this line is used to remove comma after the last line. 
	}  //this prints last digit in array

}
