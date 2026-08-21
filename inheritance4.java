//super.X
class Father{
	int fdata=10;
	Father(){System.out.println("In Father class");}
	void displayFData() {
		System.out.println("fdata="+fdata);
	}
}

class Child extends Father{
	int cdata=20;
	int X=100;
	int Y=70;
	Child(){
		super();
		System.out.println("In Child class");}
	void displayCData() {
		System.out.println("cdata="+cdata);	
	}
}

class GrandChild extends Child{
	int gcdata=30;
	int X=200;
	GrandChild(){
		super();//will be written by compiler if not written in code
		System.out.println("In GrandChild");}
	void displayGCData() {
		System.out.println("gcdata="+gcdata);
		displayCData();
		displayFData();
	}
	void displayX() {
		int X=900;
		System.out.println("X="+X);//900 local
		System.out.println("X="+this.X);//200 instance
		System.out.println("X="+super.X);//100 instance of parent class
	}
}

public class inheritance4 {
	public static void main(String[] args) {
		GrandChild ob1=new GrandChild();
		GrandChild ob2=new GrandChild();
		ob1.displayGCData();
		ob1.displayX();
		
	}

}
//this()    this.x
//super()   super.x
