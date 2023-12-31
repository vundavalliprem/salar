package multilevel_inhearitance;

public class prem extends devaraj{
	
	
	
	void pk(){
		
		System.out.println("i am son of raju");
	}

	public static void main(String[] args) {
prem P = new prem();
P.pk();
P.raju();
P.rama();

RK r= new RK();
r.rama();
	}

}
