//Overloading: Two or more function with same name, if parameters are different
public class Overloading	
{
	public static void main(String[] args)
	{
		fun(67);
		fun("Data Scientist");
	}
	static void fun(int a)
	{
		System.out.println(a);
	}
	static void fun(String name)
	{
		System.out.println(name);
	}
}
