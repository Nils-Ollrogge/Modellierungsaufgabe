public class FallingBladesTrap extends Trap {
	private int numberOfBlades;
	private double bladeVelocity;
	
	public void sharpenBlades() {
		System.out.println("Klingen erfolgreich geschärft.");
		bladeVelocity++;
	}
	public FallingBladesTrap(Room room, Sensor sensor){
		super(room,sensor);
		numberOfBlades = 4;
		bladeVelocity= 7.5;
		
		}
	
	public void setVelocity(double newVelocity) {
		this.bladeVelocity=newVelocity;
			}
	
	public int getBladeNumber() {
		return numberOfBlades;
	}
	public double getBladeVelocity() {
		return bladeVelocity;
	}
	public void retractBlades(){
		System.out.println("Klingen erfolgreich in die Wand zurückgefahren!");
	}
	@Override
	public void trigger() {
		if (getEnabled()){
			System.out.println("Klingenfalle ausgelöst.");
						
		}
		else {
			System.out.println("Falle nicht aktiv. Falle wurde nicht ausgelöst.");
		}
	}

}
