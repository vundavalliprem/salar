package overrideing;

public class classA {
	void name(int e){
		
		System.out.println("parent class non static:::"+e);
	
	}
	classA(String p){
		System.out.println("parent class constructor method:::"+p);
		// the parent contructor will come automatically ,but non static methods in parent wont come to child until it calls with super

	}
}
