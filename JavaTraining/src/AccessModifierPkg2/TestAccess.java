package AccessModifierPkg2;

import AccessModifierPkg1.Test1;

public class TestAccess {
	
	public int publicVar = 5;
	private int privateVar = 9;
	protected int protectedVar = 8;
	int defaultVar = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 obj = new Test1();
		obj.add();
		
//		Test2 obj2 = new Test2();
//		obj2.add2();    We cannot access Test2 class as it has default access modifier
		
		TestAccess obj3 = new TestAccess();
		System.out.println(obj3.publicVar);
		System.out.println(obj3.protectedVar);
		System.out.println(obj3.privateVar);
		System.out.println(obj3.defaultVar);

	}

}
