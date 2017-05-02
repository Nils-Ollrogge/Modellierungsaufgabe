
public class GuardHamster extends Animal {
	double trainingStatus=0.5;
	
	public GuardHamster(){
		this.numberOfLegs=4;
		}
	public void collectFood() {
		System.out.println("Erfolgreich essen gesammelt!");
	}
	public void guardRoom(Room room) {
		room.goTo(room);
		System.out.println("Hamster bewacht jetzt anderen Raum!");
	}

}
