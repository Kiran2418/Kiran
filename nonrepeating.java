package work;

public class nonrepeating 
    {
	  public class Solution
     {
      public static char findFirst(String input) {
      
  
      return ('a');
     }
 
    public static boolean  doTestsPass()
    {
   
   String[] input={"apple","racecars","ababdc"};
   char[] output={'a','e','d'};
     boolean result=true;
   for(int i=0;i<input.length;i++)
        {
        result=result && findFirst(input[i])==output[i];
        if(!result)
          {System.out.println("Test failed for" + input[i]);
          }
        else
          System.out.println("Test passed for"+input[i]);
     return result;
     }
	return result;
         }
  public static void main(String[] args)
    {
    doTestsPass();
    }
    }
    }




