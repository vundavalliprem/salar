package constructors;

public class parameter_constructor2 {
String q ="practice more ";
float f =10.1F;
parameter_constructor2(){
	this(10);                      //Constructor call must be the first statement in a constructor
	this.z2();
this.z1();
	System.out.println("hi sai");
	System.out.println("hi revanth");

	
}
void z1(){
	System.out.println("hi prem");
	System.out.println("hi jairam");
	System.out.println("hi gowtham");

}
void z2() {
	System.out.println("hi ashok:-"+f);
	
}
parameter_constructor2(int q){
	
}

	public static void main(String[] args) {
		new parameter_constructor2();
	}

}
