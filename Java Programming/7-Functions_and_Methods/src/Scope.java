
public class Scope
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
			
		{
			//Values defined in this block will remain in this block
			//not defining the variable a but initialising(modfiying)
			a = 30;				//Here this block is inside the main{} block so we can modify the value of a
			int c = 99;			//Variable c can only be accessed in this particular block
		}
		System.out.println(a);	//This will print a = 30
		//System.out.println(c);	//This will give error as variable C is not be access outside the above block
	}

}
