package Encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj = new Bank();
		obj.setPin(123456, 2222, 5678);
		obj.withdrawAmt(123456, 5678, 500);
		int AccNo = obj.getAccNumber();
		System.out.println(AccNo);
		obj.setAccNumber(67855);
		int AccNo1 = obj.getAccNumber();
		System.out.println(AccNo1);
		
	}

}
