package overrideing;

public class classB extends classA {

	void name(String q) {
		super.name(7);
		System.out.println("child class non static method:::" + q);

	}
classB(){
	
}
	public static void main(String[] args) {
		classB z = new classB();
		z.name("www");
		z.name(8);
		z.classA("i");
	}

}
