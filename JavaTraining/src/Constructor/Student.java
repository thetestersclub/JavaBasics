package Constructor;

public class Student {
	
	//Constructors have same name as that of the class
	//Constructors should not have return type
	/*
	 * Types of constructors
	 * 
	 * default constructor
	 * no-arg constructor
	 * paramaterized constructor
	 
	 */
	public Student(int studentRollNo){
		System.out.println("inside Student contructor");
		
	}

	String studentName = "Suraj";
	int studentRollno = 11;
	
	
	
	public Student(String studentName, int studentRollno){
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		
		
	}


	
	
	public void method() {
		studentName = "Suraj";
		studentRollno = 11;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student("Himani",10);
		new Student(11);
		System.out.println(obj.studentName);
		System.out.println(obj.studentRollno);
		
		obj.method();
		System.out.println(obj.studentName);
		System.out.println(obj.studentRollno);
		
		

	}


}
