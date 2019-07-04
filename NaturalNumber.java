package day4;
//class to find naturals numbers divide by 3 and 5
public class NaturalNumber {
	//Declaration of variable
int n;
int sum=0;
	//to calculate operation
public int calculateSum(int a)
{
n=a;
for(int i=1;i<=n;i++)
{
	//condition check
if(i%3==0 || i%5==0)
{
sum=sum+i;
				
}
			
}
//return type 
return sum;
	}

}
