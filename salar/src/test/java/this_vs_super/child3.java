package this_vs_super;

public class child3 extends parent3 {
	String name = "prem";

	void pk() {
		String name = "vundavalli";

		System.out.println("father name is:" + super.name);
		System.out.println("son    name is:" + this.name);
		System.out.println("local  name is:" + name);
        this.m2();  // calls child class
        super.m1();   //calls parent class
       
	}
void m2()
{
	
System.out.println("this is m2 in child class");
}

child3(){
	  super();   //Constructor call must be the first statement in a constructor
	System.out.println("this is constructor");
}
	public static void main(String[] args) {
		child3 c = new child3();

		c.pk();// or
//System.out.println("c.fathername");        
//System.out.println("c.sonname");

	}

}
