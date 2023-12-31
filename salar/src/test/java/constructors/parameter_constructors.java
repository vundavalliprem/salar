package constructors;

public class parameter_constructors {
	
	
	 void lorry(String e, String f)
	{
	
		System.out.println("method:"+e);
		System.out.println("method:"+f);

	}

	parameter_constructors(String c, int d)
	{
		System.out.println("string and int constructor:"+c);
		System.out.println("string and int constructor:"+d);
	lorry("lorry method","lorry method");    // method can be called in constructors or parameter constructor at any time
	
	}
	
	
	parameter_constructors(String a, String b)
	{
		
		System.out.println("string and string constructor:"+a);
		System.out.println("string and string constructor:"+b);
		//lorry("lorry method","lorry method");
	}
	
	void m1()
	{
	int	cc=1;
	int	cccc= 11;
	int	ccccc= 111;      // you have to call the values using syso print statement 
	int	cccccc= 1111;
	int	ccccccc= 11111;
	System.out.println(cc+cccc+ccccc+cccccc+ccccccc);
	
	
	}
	public static void main(String[] args) {
		
		 parameter_constructors h=	new parameter_constructors("zzz:",9);
			new 	parameter_constructors("az","azz");
h.m1();

	}

}
