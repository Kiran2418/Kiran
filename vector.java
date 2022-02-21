package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args)throws Exception {
		
		Vector<Integer> values = new Vector <Integer>();
		values.add(3);
		values.add(55);
		values.add(8);
		values.add(1,9);
		values.add(10);
		values.remove(1);
		
		System.out.println(values.capacity());
		{
		Collections.sort(values);
		
		
		for (Object i : values)
		{
			System.out.println(i);
			
		}
	}
	}
}
