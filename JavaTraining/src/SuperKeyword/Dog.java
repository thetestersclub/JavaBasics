package SuperKeyword;

public class Dog extends Animal {
	
	public Dog(){
		System.out.println("Dog constructor");
	}
	
	public Dog(int x){
		super(4,5);
		System.out.println("Parameterized Dog constructor");
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("Dog Sound");
	}
	

}
