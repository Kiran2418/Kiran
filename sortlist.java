package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortlist {

	public static void main(String[] args)throws Exception {
		
		List<Integer> values = new ArrayList <Integer>();
		values.add(3);
		values.add(55);
		values.add(8);
		values.add(1,9);
		{
		Collections.sort(values);
		
		
		for (Object i : values)
		{
			System.out.println(i);
			
		}
	}
	}
}
