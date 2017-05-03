import java.util.ArrayList;

public class CameraSensor extends Sensor {
	private int xResolution;
	private int yResolution;
	private double observationDirection; 
	private double observationAngle;

	public CameraSensor() {
		super();
		this.xResolution = 800;
		this.yResolution = 600;
		this.observationDirection = 45.9;
		this.observationAngle = 90.0;
	}

			
	public int getXResolution() {
		return this.xResolution;
	}
	public int getYResolution() {
		return this.yResolution;
	}
	public double getObservationDirection() {
		return this.observationDirection;
	}
	public double getObservationAngle() {
		return this.observationAngle;
	}
	
	@Override
	public ArrayList<Integer> getSensorData() {
		// TODO Auto-generated method stub
		ArrayList<Integer> sensorArray=new ArrayList<>();
		//Bildgenerierung nicht Teil der Modellieraufgabe
		System.out.println("Sensordaten der Kamera übermittelt.");
		return sensorArray;

	}
	@Override
	public String toString() {
		return "Kamera";
	}
	
}
