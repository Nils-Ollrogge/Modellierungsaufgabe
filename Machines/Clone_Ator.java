// _p = Pointer to Object
// Singleton object
public class Clone_Ator extends Machine implements RepairInterface {
	
	public static Clone_Ator m_pInstance = null;

	public static Clone_Ator createInstance(String name) 
	{
		if (m_pInstance == null)
			m_pInstance = new Clone_Ator(name, CLONE_ATOR);
		else
			System.out.println("Du besitzt schon einen Clone_ator");
			
			return m_pInstance;
	}

	private Clone_Ator(String name, int type)
	{
		super(name, type);
		m_bEndurance = MAX_ENDURANCE;
		addMachine(this);
	}

	public void usage()
	{
		System.out.println("Dies ist der Clone_ator. Damit kannst du Objekte klonen!");
	}

	public Machine clone(String name, int type)
	{
		if (m_bEndurance >= 10)
		{
			switch (type)
			{
				case CLONE_ATOR:
				{
					System.out.println("Ein Clone_ator kann sich nicht selbst klonen!");
					break;
				}
				case FAST_FOOD_INATOR:
				{
					if (getAmount(FAST_FOOD_INATOR) >= MAX_AMOUNT)
					{
						System.out.println("Du kannst maximal zwei Stück dieser Maschine besitzen!");
						break;
					}
					else if (getAmount(FAST_FOOD_INATOR) == 0)
					{
						System.out.println("Du hast kein Fast_Food_Inator zum klonen mehr!");
						break;
					}
					Fast_Food_Inator p_FastFood = new Fast_Food_Inator(name);
					System.out.println("Fast_Food_Inator wurde geclont!");
					m_bEndurance -= 10;
					return p_FastFood;
				}
				case SELF_DESTROY_INATOR:
				{
					if (getAmount(SELF_DESTROY_INATOR) >= MAX_AMOUNT)
					{
						System.out.println("Du kannst maximal zwei Stück dieser Machine besitzen!");
						break;
					}
					else if (getAmount(SELF_DESTROY_INATOR) == 0)
					{
						System.out.println("Du hast kein Self_Destroy_Inator zum klonen mehr!");
						break;
					}
					Self_Destroy_Inator p_SelfDestroy = new Self_Destroy_Inator(name);
					System.out.println("Self_Destroy_Inator wurde geclont!");
					m_bEndurance -= 10;
					return p_SelfDestroy;
				}
			}
		}
		else
		{
			System.out.println("Der Clone_Ator ist zu kaputt! Repariere ihn zuerst, damit du klonen kannst.");
		}

		return null;
	}

	public void repair()
	{
		m_bEndurance = MAX_ENDURANCE;
		System.out.println("Clone_Ator wurde repariert");
	}
}