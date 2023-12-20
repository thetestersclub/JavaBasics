package Polymorphism;

public class Bank extends Overriding {
	
	@Override
	public double RBIHomeLoanInterest(int k) {
		return 11.5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj = new Bank();
		System.out.println(obj.RBIHomeLoanInterest(7));
		
		
		

	}

}
