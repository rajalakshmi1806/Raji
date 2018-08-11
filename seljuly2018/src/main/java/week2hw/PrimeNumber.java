package week2hw;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=11;int m=0;int temp;
		boolean isPrime=true;
		for(int i=2;i<=number/2;i++)        //eg: num=4  itteration runs for half of num 2 iter
		{
			temp=number%i;                //temp = 4%2   remainde=0
		if(temp==0)  //put remainder in if loop.if its eeual to 0 then its not prime
		{
			isPrime=false;          
			break;
		}
		}
		if(isPrime)
		{
			System.out.println("is prime");
		}
		else
		{
        System.out.println("not prime");
	}

}
}
