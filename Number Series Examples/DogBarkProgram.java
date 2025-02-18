import java.util.Set;
import java.util.LinkedHashSet;
class Q87DogBarkProgram 
{
	public static void main(String[] args) 
	{
		String dog = "B..BB..BBB...B.BBBB.BBBBB";
		String[] res = dog.split("\\.+");
		Set<String> s = new LinkedHashSet<>();
		for(int i = 0; i<res.length;i++)
		{
			s.add(res[i]);
		}
		System.out.println(s);
	}
}