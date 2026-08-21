//constructor chaining
class Father{
	int fdata=10;
	Father(){System.out.println("In Father class");}
	void displayFData() {
		System.out.println("fdata="+fdata);
	}
}

class Child extends Father{
	int cdata=20;
	Child(){
		super();
		System.out.println("In Child class");}
	void displayCData() {
		System.out.println("cdata="+cdata);
	}
}

class GrandChild extends Child{
	int gcdata=30;
	GrandChild(){
		super();//will be written by compiler if not written in code
		System.out.println("In GrandChild");}
	void displayGCData() {
		System.out.println("gcdata="+gcdata);
		displayCData();
		displayFData();
		
	}
}
public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild ob1=new GrandChild();
		GrandChild ob2=new GrandChild();
		ob1.displayGCData();
		
	}

}
//super()
