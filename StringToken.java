package day4;

import java.util.Scanner;
import java.util.StringTokenizer;
//class to read all integers and sum it
public class StringToken {
	public static void main(String[] args) {
		//Take input 
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		//invoke class StringTokenizer
		StringTokenizer s=new StringTokenizer(n,"=");
		int s1=0;
		//Sum the integers 
		while(s.hasMoreTokens())
		{
			int k=0;
		
			k = Integer.parseInt(s.nextToken());
			System.out.println("number" +k);
			s1=s1+k;
			}
		System.out.println(s1);

}
}
