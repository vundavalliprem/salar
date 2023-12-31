package super_vs_this2;

public class child extends parent {
	
		
	child(){
		//this();     //doesn't understand
	//super();      //if you call this you wont get constructor in child 
System.out.println("i am child class constructor");
		
	}
	
	child(float q){
		
		this();
		   //if you call this you will get constructor in child and parent as well
		System.out.println("i am child class constructorwith parameters::"+q);
		
		
		
	}
	public static void main(String[] args) {
		 ;
		 new child(1.11F);
   //new child();
	}

}
