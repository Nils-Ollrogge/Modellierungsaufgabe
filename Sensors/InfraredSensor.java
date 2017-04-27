package Sensors;
import java.util.ArrayList;

public class InfraredSensor extends Sensor {
	private int numberOfLights;
	private int numberOfDetectionPanels;

	
	
	public InfraredSensor() {
		this.isBroken= false;
		this.isScanning= true;
		this.numberOfDetectionPanels=256;
		this.numberOfLights=9;	
	
	}
	@Override
	public ArrayList<Integer> getSensorData() {		
		ArrayList<Integer> sensorArray=new ArrayList<>();
		//Bildgenerierung nicht Teil der Modellieraufgabe
		System.out.println("Sensordaten der Infrarotsensoren übermittelt.");
		return sensorArray;
}
	public int getNumberOfLights(){
		return numberOfLights;
	}
	public int getNumberOfDetectionPanels(){
		return numberOfDetectionPanels;
	}
	@Override
	public String toString() {
		return "Infrarotsensor";
	}

}