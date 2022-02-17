import java.util.*;

public class Palindrome {
	
	public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number:");
			
			int num=sc.nextInt();
			int org_num= num;
		
			int rev=0;
			
			
			while(num!=0)
			{
				rev=rev*10 + num%10;
				num=num/10;
				
			}
			System.out.println("reverse number is:" +rev);
			if(org_num==rev)
			{
				System.out.println("It is a palindrome");
			}
			else
			{
				System.out.println("It is not a palindrome");
			}
			
		}
	}



