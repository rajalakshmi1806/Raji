package week2hw;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int[] a= {2,4,1};int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];  // i=0; sum=0+2=2;
		}	               //i=1; sum=2+4=6;
			              // 1=2; sum=6+1=7
		
		System.out.println("Sum is"+sum);

	}

}
