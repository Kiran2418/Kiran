import java.util.Scanner;
public class operatordemo 
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name:");
     String str= sc.next();
     String org_str=str;
     String rev="";
   int len = str.length();
    for(int i=len-1;i>=0;i--)
    {
      rev=rev+str.charAt(i);
    }
    System.out.println("Reversed name is:" +rev);
  
   
}
}