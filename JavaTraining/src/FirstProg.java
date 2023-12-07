public class FirstProg {
	public static void main(String[] args) {
	//System.out.println("Hello");
	int i;//initialization
	i = 10; // declaration
	int integer=12345678;
	float f =1.2f;
	long longinteger = 11111111222222l;
	double d= 11.22222222222222222222222222;
	boolean b=true;
	char c='d';
	String s = "Himani";
	
	
	String strobj = new String();
	strobj = "Hello";
	System.out.println(strobj);
	
	String s1 = "Hello";
	String s2 = " This is me";
	String s3 = s1 + s2 + " Again" + "s";  //String concatenation
	System.out.println(s3);
	
	int number1 = 10;
	int number2 = 20;
	int number3 = number1+number2;
	System.out.println("this is "+(10+30)+" is equal to Thirty");
	
	
	//Unary Operator
	//Binary operator
	//Ternary operator
	
	System.out.println(i--);
	System.out.println(i--);
	System.out.println(i--);
	System.out.println(!b);
	
	System.out.println(10!=10);
	System.out.println((20>70) || (10!=10) || (10>30));
	
	}
	
	
}
