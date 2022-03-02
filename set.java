package practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set
{
 public static void main (String[] args)
 {
	 Set<Integer> values = new TreeSet<>();
	 
	 values.add(52);
	 values.add(43);
	 values.add(29);
	 values.add(73);
	 
	 for (int i : values)
	 {
	 System.out.println(i);
 }
 }
}
