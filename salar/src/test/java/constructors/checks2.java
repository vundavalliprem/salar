package constructors;

//this method  practice
public class checks2 {
	int a = 10;
	int c = 30;

	 checks2() {
		int a = 20;

		System.out.println(this.a);  // this .a brings the instance variable not the local
		System.out.println(a);
		//this.m2("a", "aa");
	}
// doubt : how to bring constructor values to parameter constructor 
void m2(String x ,String y)
{
     int     d=44;
	System.out.println("this is a parameter constructor"+a);
	System.out.println("this is a parameter constructor"+d);
	System.out.println("this is a parameter constructor"+this.a); //20 wont come because it is not in the constructor
	//this.m2("a", "aa");
}

	public static void main(String[] args) {
		checks2 q = new checks2();
		//m2("aa", "bb");

		q.m2("ll", "ll");       //   you can give this or you can give 13 line

	}

}
