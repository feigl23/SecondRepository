
public class PiCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi =2;
		
		for(double i =1; i<=10000; i++)
		{
			double WallisLeft = (2*i)/(2*i-1);
			double WallisRight = (2*i)/(2*i+1);
			pi= pi*WallisLeft*WallisRight;
			System.out.println("current pi: "+pi);
			
		}
		System.out.println("The value of estimated pi is: "+pi);
		double pi_2 =calculatePI(1000);
		System.out.println("current pi: "+pi_2);
	}

public static double calculatePI(int limit)
{
	double pi=0;
	double divider =1;
	
	for(int i =0; i < limit; i++)
	{
		double valami =1 /divider;
		if((i%2)==0)
		{
		
			pi+=valami;
		}
		else
		{
		
			pi-=valami;
			
		}
		divider+=2;

	}
	return pi*4;
}
}