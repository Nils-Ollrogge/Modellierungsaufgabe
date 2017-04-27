package Traps;
import Rooms.Room;
import Sensors.Sensor;

public class ShockFloorTrap extends Trap{
	private int floorTiles;
	private double voltage;
	
	
	
	public ShockFloorTrap(Room room, Sensor sensor) {
		super(room, sensor);
		this.isBroken=false;
		floorTiles=16;
		voltage= 1234.5;
			
	}
	public void trigger() {	
		System.out.println("Schockfalle ausgelöst. ");
		this.setEnabled(false);
	}
	public int getTiles() {
		return floorTiles;
		}
	public void setVoltage(double newVoltage) {
		if (newVoltage>0){
		this.voltage=newVoltage;
		}
	}
	public double getVoltage() {
		return voltage;}
	
	public void increaseVoltage(double newVoltage) {
		this.voltage += newVoltage;
	}
	
	public void decreaseVoltage(double newVoltage) {
		this.voltage-=newVoltage;
		if (this.voltage<0){
			this.voltage=0;
		}
	}
	@Override
	public String toString() {
		return "Druckplatte";
		}

}
