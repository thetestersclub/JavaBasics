package Polymorphism;


public class Overloading {

	//polymorphism - same name but multiple forms of class properties
	
//	Polymorphism:
//	Overloading - same method name but different method signatures in same class
//	Overriding - different classes (with inheritance applied) we have same method name with same signature
	
	public void add(int i, String j)
	{
		System.out.println("Add");
	}
	
	public void add(String j, int k)
	{
		System.out.println("Add 1");
		System.out.println("Add 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		obj.add("him",2);

	}
}
