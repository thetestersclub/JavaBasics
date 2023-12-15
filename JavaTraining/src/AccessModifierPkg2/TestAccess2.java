package AccessModifierPkg2;

public class TestAccess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAccess obj3 = new TestAccess();
		
		System.out.println(obj3.publicVar);
		System.out.println(obj3.protectedVar);
		//System.out.println(obj3.privateVar);  //private members will be only accessible in their own class
		System.out.println(obj3.defaultVar);

	}

}
