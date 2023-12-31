package this_vs_super;

public class child extends parent {
String sonname ="prem";


void pk()
{
    String localname = "vundavalli";
	System.out.println("father name is:"+fathername);
	System.out.println("son    name is:"+sonname);
	System.out.println("local  name is:"+localname);
	
}






	public static void main(String[] args) {
child c = new child();

c.pk();                                           // we can this way -by calling non static method we can get everything in it 
//System.out.println("c.fathername");              // or we can call single by single
//System.out.println("c.sonname");


	}

}
