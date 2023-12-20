package AbstractClasses;

public abstract class WebDriver {
	
	public abstract void click(int i);
	public abstract void sendkeys();
	public abstract void getTitle();
	public abstract void close();
	
	public void concreteMethod() {
		System.out.println("Concrete method");
	}
	

}
