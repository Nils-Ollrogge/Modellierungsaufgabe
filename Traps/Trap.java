import java.util.ArrayList;

public abstract class Trap implements RepairInterface, Putable{
	
	protected boolean isBroken;
	protected boolean isEnabled;
	protected Room room;
	protected Sensor sensor;
	protected static ArrayList<Trap> TrapList = new ArrayList<>();
	protected int trapId;
	
	
	
	//+++++++++++++CONSTRUCTORS++++++++++++++++++++++
	public Trap(){
		this.isBroken = false;
		this.isEnabled= true;
		trapList.add(this);	
		this.trapId=trapList.size();
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
	
	//+++++++++++++++++++++GETTER&SETTER+++++++++++++++++++++
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
	public int getTrapId() {
		return this.trapId;
	}

	public ArrayList<Trap> getTrapList(){
		return trapList;
	}
	
	//++++++++++++++++++SPECIFIC METHODS+++++++++++++
	public void rearmTrap(){
		this.isEnabled=true;
	}
	public String toString(){
		String trapString= "Typ: Falle; ID: "+trapId+"";
		return trapString;
		
	}
	//abstract declaration of trigger-function; overridden by subclasses 
	public abstract void trigger();
	
	//Überschreiben der Interface-Funktion repair()
	public void repair(){
		this.isBroken=false;
		}
	
}
