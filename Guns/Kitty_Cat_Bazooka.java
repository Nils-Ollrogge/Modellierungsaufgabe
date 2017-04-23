public class Kitty_Cat_Bazooka extends SpecialGun implements RepairInterface {
	boolean isTransformed;

	public Kitty_Cat_Bazooka(String name, int specialcost)
	{
		super(name, specialcost, KITTY_CAT_BAZOOKA);
		isTransformed = false;
	}

	public void usage()
	{
		System.out.println("Dies ist die " + m_sName);
		System.out.println("Um normale Schüsse abzugeben benötigst du Katzen als Munition!");
		System.out.println("Die Superattacke benötigt keine Munition!");
	}

	public void specialAttack()
	{
		if (!isTransformed)
		{
			System.out.println(m_sName + " hat sich in eine Roboterkatze verwandelt!");
			isTransformed = true;
		}
		else
		{
			System.out.println(m_sName + " ist schon verwandelt. Du musst sie erst wieder reparieren um die Attacke erneut zu benutzen!");
		}
	}

	public void repair()
	{
		m_bEndurance = MAX_ENDURANCE;
		isTransformed = false;
	}
}
