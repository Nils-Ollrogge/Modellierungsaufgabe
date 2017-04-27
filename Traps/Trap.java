package Traps;
import java.util.ArrayList;

import Rooms.Room;
import Sensors.Sensor;
import Interfaces.Repairable;
public abstract class Trap implements Repairable{
	
	protected boolean isBroken;
	protected boolean isEnabled;
	protected Room room;
	protected Sensor sensor;
	protected double trapId;
	//private ArrayList<Trap> trapList = new ArrayList<>();
	
	//abstract declaration of trigger-function; overridden by subclasses 
	public abstract void trigger();
	
	//Überschreiben der Interface-Funktion
	public void repair(){
		this.isBroken=false;
	}
	
	public Trap(){
		this.isBroken = false;
		this.isEnabled= true;
		this.trapId=Math.random();
		//TODO: add Trap to any kind of super-inventory-list
		//trapList.add(this);	
		//this.trapId=trapList.size();
		}
	public Trap(Room newRoom){
		this();
		this.room=newRoom;
	}
	public Trap(Sensor newSensor) {
		this();
		this.sensor=newSensor;
	}
	
	
	public Trap(Room newRoom, Sensor newSensor) {
		this();
		this.sensor =newSensor;
		this.room=newRoom;
		}
	
	public boolean getEnabled() {
		return this.isEnabled;
	}
	public void setEnabled(boolean newStatus) {
		this.isEnabled=newStatus;
	}
	public boolean getBrokenStatus() {
		return isBroken;
	}
	public void setBrokenStatus(boolean newStatus) {
		this.isBroken = newStatus;		
	}
	
	public Room getRoom(){
			return this.room;
	}
	
	public Sensor getSensor(){
		return sensor;
		}
		public void setSensor(Sensor newSensor){
		this.sensor = newSensor;
		System.out.println("Sensor gewechselt. Neuer Sensor der Falle: "+sensor);
	}
/* Die folgenden Funktionen werden wahrscheinlich noch geändert, je nachdem, wie wir eine übergeordnete Inventar-Superklasse organisieren
	public double getTrapId() {
		return this.trapId;
	}

	public ArrayList<Trap> getTrapList(){
		return trapList;
	}
	public void rearmTrap(){
		this.isEnabled=true;
	}
	public String toString(){
		String trapString= "Typ: Falle; ID: "+trapId+"";
		return trapString;
		
	}
*/	
}
