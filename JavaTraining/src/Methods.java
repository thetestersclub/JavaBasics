
public class Methods {
	//Return type -> dataType of value returned by method
	//keyword -> return
	
	//Global variable
	
	int i=0;
	
	public int Add(int a,int b) {

		int c= a+b;
		return c;
		//local variable
		
	}
	
	public int Sub(int a,int b) {
		Methods obj = new Methods();
		int sum = obj.Add(8, 0);
//		System.out.println("Addition = "+sum);

		int c= a-b;
		return c;
		//local variable
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj = new Methods();
		int subs = obj.Sub(7, 4);
		System.out.println("Subtraction = "+subs);
		Methods obj1 = new Methods();
		int subs1 = obj1.Sub(10, 4);
		System.out.println("Subtraction = "+subs1);
	}

}
