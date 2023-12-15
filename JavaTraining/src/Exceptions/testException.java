package Exceptions;

public class testException {

	public static void main(String[] args) throws Throwable {
		System.out.println("Begin");
		
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);


		
		try {
			int div = 10/0;
			System.out.println(div);
		}catch(Throwable t) {
			System.out.println("Error occured ..but handled");
			System.out.println(t.getMessage());
			t.printStackTrace();
			
		}
		
		
		
		
		System.out.println("End");

	}

}
