/* prefixing variables for better readablitity
	m_ = member of a class
	b  = integer
	s  = string
	is_ = boolean
*/

public abstract class Gun implements Putable{
	// Constants
    protected static final int CAKE_CANNON = 0;
    protected static final int KITTY_CAT_BAZOOKA = 1;
    protected static final int SHOTGUN = 2;
	protected static final int MAX_ENDURANCE = 10;
	protected static final int MAX_AMMO = 10;

	protected final String m_sName;
	protected int m_bAmmo;
	protected int m_bEndurance;
	private int m_bType;

	public Gun(String name, int type)
	{
		m_sName = name;
		m_bType = type;
	 	m_bEndurance = MAX_ENDURANCE;
	 	m_bAmmo =  MAX_AMMO;
	}

	public String getName()
	{
		return m_sName;
	}

	public int getType()
	{
		return m_bType;
	}

	public void shoot()
	{
		if (m_bAmmo <= 0 || m_bEndurance < 1)
		{
			if (m_bAmmo <= 0)
				System.out.println("Die Waffe hat keine Munition mehr! Du musst die Waffe neu laden!");
			else
				System.out.println("Die Waffe ist kaput! Du musst sie erst reparieren um sie erneut benutzen zu können!");
		}
		else
		{
			System.out.println(m_sName + " hat geschossen!");
			m_bAmmo--;
			m_bEndurance--;
		}
	}

	public void reload()
	{
		m_bAmmo = MAX_AMMO;
	}

	public abstract void usage();
}