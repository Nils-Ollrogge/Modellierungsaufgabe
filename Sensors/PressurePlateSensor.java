package Sensors;
import java.util.ArrayList;

public class PressurePlateSensor extends Sensor {
	private int numberOfPlates;
	private double pressureThreshold;

	public PressurePlateSensor() {
		super();
		this.numberOfPlates=16;
		this.pressureThreshold=40;
		}

	
	public double getPressureThreshold() {
		return pressureThreshold;
	}

	public void setPressureThreshold(double pressureThreshold) {
		this.pressureThreshold = pressureThreshold;
	}

	public int getNumberOfPlates() {
		return numberOfPlates;
	}
	
	@Override
	public ArrayList<Integer> getSensorData() {
		ArrayList<Integer> sensorArray=new ArrayList<>();
		//Bildgenerierung nicht Teil der Modellieraufgabe
		System.out.println("Sensordaten der Druckplatten übermittelt.");
		return sensorArray;
	}

}
