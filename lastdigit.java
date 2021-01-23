import java.util.*;
// Made by Sazid


public class lastdigit {
	public static void main(String[] arg)
	{System.out.println("*****************Anagram Checker*****************");
	System.out.println("                  Made By Sazid");
	System.out.println();
	System.out.println();
	System.out.println();
		Scanner sc=new Scanner(System.in);
		String str,str2;
		boolean flag=false;
		System.out.print("Enter First String= ");
		str=sc.next();
		System.out.print("Enter Second String= ");
		str2=sc.next();
		int l1,l2,count,count2;
		l1=str.length();
		l2=str2.length();
		if(l1==l2)
		{
		for(int i=0;i<l1;i++)
		{count=0;
		count2=0;
			for(int j=0;j<l1;j++)
			{
			if(str.charAt(i)==str2.charAt(j))
			count++;
			}
			for(int j=0;j<l1;j++)
			{
			if(str.charAt(i)==str.charAt(j))
			count2++;
			}
			if(count==count2)
				flag=true;
			else 
				{flag=false;
				break;
				}
		}
		}
		if(flag)
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
					sc.close();
		}
}
