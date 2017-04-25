// not repairable
public class Self_Destroy_Inator extends Machine {

	public Self_Destroy_Inator(String name)
	{
		super(name, SELF_DESTROY_INATOR);
		addMachine(this);
		System.out.println("Du has eine Self_Destroy_Inator erstellt. Bitte beachte, dass dieser nur durch Klonen neu geschaffen werden kann.");
	}

	public void usage()
	{
		System.out.println("Dies ist der Self_Destroy_Inator. Er kann sich nur selbst zerstören, wenn es eine geklonte Version von ihm gibt!");
	}

	public boolean selfDestroy()
	{
		if(getAmount(m_bType) == 1)
			System.out.println("Das war dein letzter Self_Destroy_Inator! Du hast vergessen ihn zu klonen");

		removeMachine(this);
	    return true;
	}
}