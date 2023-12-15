package Exceptions;

public class Finally {
	static int k=10;
	static int var = 7;

	public static void main(String[] args) {
		int var = 7;
		var=9;
		k=15;
		System.out.println(k);

		try {
			int div = 10/0;
			System.out.println(div);
			//DB connection  ---exception
			//Execute SQL queries
			//validation data
			//Closing the connection
		}catch(Exception e) {
			System.out.println("Exception handled");
	}
			finally {
			System.out.println("Finally");
		}

	}

}
