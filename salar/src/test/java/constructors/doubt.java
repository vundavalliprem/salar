package constructors;

public class doubt {
	
	
	public void m1(double e, double d)
	{
		
		System.out.println("aaaaa");
		
	}
	public void m1(float c ,int d)
	{
		
		
		System.out.println("bbb");
	}


	public static void main(String[] args) {
		
		doubt z = new doubt();
		z.m1(10, 10.1);
		z.m1(10.1, 10);
	}

}
