package work;

public class runlengthencoding {


		public static String rle(String input)
		{
			StringBuffer bf= new StringBuffer();
			
			for(int i=0;i<input.length()-1;i++)
			{
				int count=1;
				while(i<input.length()-1 && input.charAt(i) ==input.charAt(i+1) )
				{
					count++;
					i++;
				}
				bf.append(input.charAt(i));
				bf.append(count);
			}
			return bf.toString();
		}
		public static void main(String []args)
		{
			System.out.println(rle("aaa"));
			System.out.println(rle("aa"));
			System.out.println(rle("aabbcad"));
			System.out.println(rle("aaabbcdc"));
			
		}	
		}