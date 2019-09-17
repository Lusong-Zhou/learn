
public class Test1 {

	public static void main(String[] args) {	
		try
		{
			A();
		}
		catch(ArithmeticException ex)
		{
			
		}
	}
	public static void A()throws ArithmeticException
	{
		B();
	}
	public static void B()throws ArithmeticException
	{
		C();
	}
	public static void C()throws ArithmeticException
	{
		int a=15/0;
	}
}
