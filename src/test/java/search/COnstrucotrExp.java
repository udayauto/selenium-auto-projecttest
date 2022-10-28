package search;

public class COnstrucotrExp {
	//method
    // vs Constructor ---special
	//String name;
	
	public COnstrucotrExp() { //className //return
		System.out.println("This is a constructor");
		
	}
	
	public void add() {	
		int a=10, b=20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		COnstrucotrExp obj = new COnstrucotrExp(); //
		
		//System.out.println(name);
		obj.add(); //call using object.
		
		//no need to execute constructor 
		
	}
	
	

}
