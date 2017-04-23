public class Shotgun extends Gun implements RepairInterface {

	public Shotgun(String name)
	{
		super(name, SHOTGUN);
	}

	public void usage()
	{
		System.out.println("Dies ist die " + m_sName);
		System.out.println("Um normale Schüsse abzugeben benötigst du Patronen als Muniton");
		System.out.println("Diese Waffe besitzt keine Superattacke");
	}

	public void repair()
	{
		m_bEndurance = MAX_ENDURANCE;
	}
}