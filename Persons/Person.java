
public abstract class Person implements Putable{
	protected boolean isEvil;
	protected int age;
	protected Room location;
	
	public void eat() {
		System.out.println("Mampfmampf...");
	}
	public void sleep() {
		System.out.println("*schnarch*");
	}
	
	public boolean getEvilness() {
		return this.isEvil; 
	}
	public int getAge() {
		return this.age; 
	}
	public boolean getRoom() {
		return this.location; 
	}
	protected void setEvil(boolean newStatus){
		this.isEvil=newStatus;
	}
	protected void setAge(int newAge){
		this.age=newAge;
	}
	protected void setStartLocation(Room newRoom){
		this.location=newRoom;
	}


}
