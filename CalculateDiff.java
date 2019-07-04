package day4;
import java.util.*;

//to find difference of square sum and sum of n natural numbers
public class CalculateDiff {
	public int calculateDiff()
	{
		int d=0;
		int sqr_sum=0;
		int ntral_sum=0;
		
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		
		//calculate sum of square
		for(int i=0;i<=size;i++)
		{
			sqr_sum=sqr_sum+(i*i);
		}
			for( int i=1;i<=size;i++)
				ntral_sum=ntral_sum+i;
			
		
		ntral_sum=ntral_sum*ntral_sum;
		//find difference of sum of n natural numbers
		d=sqr_sum-ntral_sum;
		return -d;
		
		
		
	}

}
