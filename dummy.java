import java.util.*;
public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Random r = new Random();
		int a[] = new int[90];
		 
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=r.nextInt(90);
		}
		try {
System.out.println(a[92]);
}
		catch(Exception e)
		{
			System.out.println("Maximium is 90");
		}
		for(int i : a)
			
			System.out.println(a[i]);}

	}

