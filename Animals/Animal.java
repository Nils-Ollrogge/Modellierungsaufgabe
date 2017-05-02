
public abstract class Animal {
	protected int numberOfLegs;
	protected boolean isGuarding = false;
	protected Room location;
	
	public void eat() {
		System.out.println("Nomnomnom...");
	}
	public void sleep() {
		System.out.println("Zzzzzzzzzz....");
	}
	public void guard() {
		if (!isGuarding) {
			System.out.println("Wachmodus aktiviert");
			this.isGuarding=true;
		}
		else {
			System.out.println("Wachmodus deaktiviert");
			this.isGuarding=false;
		}
	}
	
}
