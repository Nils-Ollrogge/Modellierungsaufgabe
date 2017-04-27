package Traps;
public class EMPTrap extends Trap{
	private double pulseStrength;
	private double pulseDuration;
	private double charge;
	private double maxCharge;

	public EMPTrap() {
		super();
		this.pulseStrength=20.0;
		this.pulseDuration=5.0;
		this.maxCharge=100;
		this.charge=maxCharge;
	}
	
	
	@Override
	public void trigger(){
		System.out.println("EMP-Falle ausgelöst. ");
		this.setEnabled(false);
		this.charge=0.0;
		}
	
	public double getPulseStrength() {
		return pulseStrength;
	}
	
	public void setPulseStrength(double pulseStrength) {
		this.pulseStrength = pulseStrength;
		this.pulseDuration=this.maxCharge/this.pulseStrength;
		System.out.println("EMP-Pulsstärke geändert. Neue Stärke: "+this.pulseStrength+"; neue Dauer: "+this.pulseDuration);
		}


	public double getPulseDuration() {
		return pulseDuration;
	}


	public void setPulseDuration(double pulseDuration) {
		this.pulseDuration = pulseDuration;
		this.pulseStrength=this.maxCharge/this.pulseDuration;
		System.out.println("EMP-Pulsstärke geändert. Neue Stärke: "+this.pulseStrength+"; neue Dauer: "+this.pulseDuration);
		
	}



}
