public class Fast_Food_Inator extends Machine implements RepairInterface {
	
	Fast_Food_Inator(String name)
	{
		super(name, FAST_FOOD_INATOR);
		addMachine(this);
		System.out.println("Du has eine Fast_Food_Inator erstellt!");
	}

	public void usage()
	{
		System.out.println("Dies ist der Fast Food Inator. Damit kannst du Fast Food generieren!");
	}

	public void generateFood()
	{
		m_bEndurance--;
	}

	public void repair()
	{
		m_bEndurance = MAX_ENDURANCE;
		System.out.println("Fast_Food_Inator wurde repariert");
	}
}
