package Sensors;
import java.util.ArrayList;

public abstract class Sensor {
	protected boolean isBroken;
	protected boolean isScanning;
	
	public Sensor(){ 
		this.isBroken=false;
		this.isScanning=true;
	}
		
	public boolean getBrokenStatus() {
		System.out.println();
		return this.isBroken;
		
	}
	public boolean getScanningStatus() {
		System.out.println();
		return this.isScanning;
	}
	public void setScanningStatus(boolean newStatus){
		System.out.println();
		this.isScanning= newStatus;
		}
	public void setBrokenStatus(boolean newStatus){
		System.out.println();
		this.isScanning=newStatus;
	}
	public abstract ArrayList<Integer> getSensorData();
	

}
