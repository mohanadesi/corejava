package jan2023;

public class ForloopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean isPrime;
		num=5;
		if (num<2)
		isPrime=false;
		else
			isPrime=true;
		
		for(int i=2; i<=num/i; i++)
		{
			if ((num % i==0))
			{
				isPrime=false;
				break;
			}
		}
		if (isPrime)
		{
			System.out.println("Prime number - " +num);
		}
		else
			System.out.println("Not Prime number");
	}
			
	}



