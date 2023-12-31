package this_vs_super;

public class child2 extends parent2 {
	String name = "prem";

	void pk() {
		String name = "vundavalli";
		
		//case1
		System.out.println("father name is:" + name);
		System.out.println("son    name is:" + name);
		System.out.println("local  name is:" + name);
        //case2
		System.out.println("father name is:" +super.name);
		System.out.println("son    name is:" + this.name);
		System.out.println("local  name is:" + name);
		
		
	}
//*** if non static variable name ,local variable,parent variable,instance variable are same then the system will take local variable

	public static void main(String[] args) {
		child2 c = new child2();

		c.pk();
//System.out.println("c.fathername");        
//System.out.println("c.sonname");

	}

}
