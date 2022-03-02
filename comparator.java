package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {

	public static void main(String[] args)throws Exception {
		
		List<Integer> values = new ArrayList <Integer>();
		values.add(302);
		values.add(551);
		values.add(128);
		values.add(515);
		values.add(155);

		Comparator<Integer> com = new Comparator<Integer>()
				{

					@Override
					public int compare(Integer o1, Integer o2) {
						
						if(o1%10>o2%10)
						return 1;
						
						return -1;
					}
			
				};
			Collections.sort(values,com);
			
			for(Object i : values)
			{
				System.out.println(i);
			}
		
		
		
	}}
