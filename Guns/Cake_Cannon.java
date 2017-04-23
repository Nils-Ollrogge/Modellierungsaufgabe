public class Cake_Cannon extends SpecialGun implements RepairInterface  {

	public Cake_Cannon(String name, int specialcost)
	{
		super(name, specialcost, CAKE_CANNON);
	}

	public void usage() 
	{
		System.out.println("Dies ist ist die " + m_sName);
		System.out.println("Um normale Schüsse abzugeben benötigst du ein Kuchen als Munition!");
		System.out.println("Die Superattacke benötigt 4 Kuchen als Munition!");
	}

	public void specialAttack()
	{
		if (m_bAmmo >= m_bSpecialCost && m_bEndurance >= m_bSpecialCost)
		{
			System.out.println("Der Riesenkuchen wurde abgefeuert!");
			m_bAmmo -= m_bSpecialCost;
			m_bEndurance -= m_bSpecialCost;
		}
		else
		{
			System.out.println("Du hast nicht genug Munition um die Superattacke zu benutzen!");
		}
	}

	public void repair()
	{
		m_bEndurance = MAX_ENDURANCE;
	}
}
