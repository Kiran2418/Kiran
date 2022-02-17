
public class multidim_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,9,5,2};int b[]= {8,1,4,6}; int c[]= {3,5,2,2};
		int p[] [] = {
				{4,9,5,2},
				{8,1,4,6},
				{3,5,2,2},
		};
		for(int i[] : p)
		{
			for(int j : i)
			{
				System.out.print(j + "");
			}
			System.out.println("");
		}

