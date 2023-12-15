package Encapsulation;

public class Bank {
	
	public int accNumber = 123456;
	private int pinNo = 2222;
	private long balanceAmount = 10000;
	
	public void withdrawAmt(int AccNo, int pin, int amt) {
		if(AccNo == accNumber && pin == pinNo) {
			if(amt<balanceAmount) {
				balanceAmount = balanceAmount-amt;
				System.out.println("Widrawl successfull");
			}else {
				System.out.println("insufficient balance");
			}
			
		}else {
			System.out.println("Invalid Credentials in Withdraw method");
		}
	}

	public void setPin(int accNo,int oldpin,int newPin) {
		if(accNo==accNumber && oldpin == pinNo) {
			pinNo = newPin;
			System.out.println("Update Successful");
		}else {
			System.out.println("Invalid credentials in updatePin method");
		}
	}
	
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public long getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public void getAccountNum() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
