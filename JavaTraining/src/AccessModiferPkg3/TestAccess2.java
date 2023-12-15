package AccessModiferPkg3;

import AccessModifierPkg2.TestAccess;

public class TestAccess2 extends TestAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inheritance -> when one class obj inherits the other class properties
		//A,B -> A extends B -> A is child class , B is the parent class
		//extends & implement
		
		TestAccess obj3 = new TestAccess();
		
		System.out.println(obj3.publicVar);
		//System.out.println(obj3.protectedVar);
		//System.out.println(obj3.privateVar);  //private members will be only accessible in their own class
		//System.out.println(obj3.defaultVar);//default members will not be accessible outside the package

		TestAccess2 obj4 = new TestAccess2();
		System.out.println(obj4.protectedVar);
	}

}
