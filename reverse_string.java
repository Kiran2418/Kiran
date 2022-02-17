
public class reverse_string {
	public static void main(String[] args)
	{
		String str="mom";
		String rev="";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		
		System.out.println("reverse string is:"+rev);
		}
	if(str == rev)
	{
		System.out.println("It is a palindrome");
		
	}
		
	else
	{
		System.out.println("It is not a palindrome");
	}
	
	}}
