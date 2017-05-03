
public class GuardHamster extends Animal {
	
	double trainingStatus;
	
	public GuardHamster(){
		this.numberOfLegs=4;
		this.trainingStatus=0.5;
		}
	public void collectFood() {
		System.out.println("Erfolgreich essen gesammelt!");
	}
	public void guardRoom(Room room) {
		room.goTo(room);
		System.out.println("Hamster bewacht jetzt anderen Raum!");
	}

}
