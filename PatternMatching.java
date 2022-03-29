package work;

public class PatternMatching {

	public static void main(String[] args) {

String text = "kiran";
String pattern = "ran";

boolean result = text.contains(pattern);

if(result)
{
	System.out.println("Pattern found");
}
else
{
	System.out.println("Not found");
}
	}

}

