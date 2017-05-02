
public class Squark extends Animal {
	int numberOfMouths;
	
	public Squark() {
		this.numberOfMouths=2;
		this.numberOfLegs=10;
		}
	public void bite() {
		System.out.println("Der Squark beiﬂt "+numberOfMouths+"x zu!");
	}
	public void strangle() {
		System.out.println("Der Squark packt zu. Es gibt kein Entkommen!");
	}

}
