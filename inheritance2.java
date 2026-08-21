class Father{
	int fdata=10;
	void displayFData() {
		System.out.println("fdata="+fdata);
	}	
}

class Child extends Father{
	int cdata=20;
	void displayCData() {
		System.out.println("cdata="+cdata);
	}
}

class GrandChild extends Child{
	int gcdata=30;
	
	void displayGCData() {
		System.out.println("gcdata="+gcdata);
		displayCData();
		displayFData();
		
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild ob1=new GrandChild();
		ob1.displayGCData();
		
	}

}
