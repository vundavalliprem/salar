package constructors;

public class extendss {
String w= "instance variable";
	extendss() {
		this(1);
		System.out.println(w);
        this.r();   
	}

	extendss(int a) {
		this(1, 2);
		System.out.println("1:"+a);
	}

	extendss(int a, int b) {
		this(1, 2, 3);
		System.out.println("2--:"+a+b);
	}

	extendss(int d, int e, int f) {
System.out.println("3--:"+d+e+f);
	}

	void r() {

		System.out.println("this is just method");
	}

	public static void main(String[] args) {
new extendss();


	}

}
