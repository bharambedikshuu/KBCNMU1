import java.util.*;
class Abcd
{	public static void main(String []args)
	{
		Scanner HK=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=HK.nextInt();
		 int c=0;
		for(int i=1;i<=n;i++)
		{
		   if(n%i==0)
		   {
			   c++;
		   }
		}
		if(c==2)
		{
		   System.out.println("The given number is Prime");
		}
		else
		{
		   System.out.println("The given number is not Prime");
		}
		System.out.println("Total number of complete division is :  "+c);
	}
}

//x