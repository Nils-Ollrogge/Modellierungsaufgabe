// normal Guns inherit only from Gun. Special guns have an extra abstract class named SpecialGun.
public abstract class SpecialGun extends Gun {
	protected int m_bSpecialCost;

	public SpecialGun(String name, int specialcost, int type)
	{
		super(name, type);
		m_bSpecialCost = specialcost;
	}

	public abstract void specialAttack();
}