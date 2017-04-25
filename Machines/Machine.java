import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Map;
import java.util.HashMap; 
import java.util.Iterator;

public abstract class Machine {
	protected static final int CLONE_ATOR = 0;
    protected static final int FAST_FOOD_INATOR = 1;
    protected static final int SELF_DESTROY_INATOR = 2;
	protected static final int MAX_ENDURANCE = 50;
	protected static final int MAX_AMOUNT = 2;

	protected static HashMap<Integer, ArrayList<Machine>> Machines;
	static
	{
		Machines = new HashMap<Integer, ArrayList<Machine>>();
		Machines.put(CLONE_ATOR, new ArrayList<Machine>());
		Machines.put(FAST_FOOD_INATOR, new ArrayList<Machine>());
		Machines.put(SELF_DESTROY_INATOR, new ArrayList<Machine>());
	}

	private static int bID = 0;

	protected int m_bEndurance;
	protected String m_sName;
	protected int m_bType;
	protected int m_bID;

	public Machine(String name, int type) 
	{
		m_sName = name;
		m_bType = type;
		m_bID = bID++;
	}

	public static boolean addMachine(Machine machine)
	{
		if (machine instanceof Clone_Ator && Machines.get(CLONE_ATOR).size() == 0)
		{
			Machines.get(CLONE_ATOR).add(machine);
			return true;
		}
		else if (machine instanceof Fast_Food_Inator && Machines.get(FAST_FOOD_INATOR).size() < MAX_AMOUNT)
		{
			Machines.get(FAST_FOOD_INATOR).add(machine);
			return true;
		}
		else if (machine instanceof Self_Destroy_Inator && Machines.get(SELF_DESTROY_INATOR).size() < MAX_AMOUNT)
		{
			Machines.get(SELF_DESTROY_INATOR).add(machine);
			return true;
		}

		return false;
	}

	public static Machine findMachine(int bID)
	{
		Iterator it = Machines.entrySet().iterator();
  		while (it.hasNext()) {
        	Map.Entry<Integer, ArrayList<Machine>> pair = (Map.Entry)it.next();
        	for (Machine machine : pair.getValue())
        		if (machine.getID() == bID)
        			return machine;
    	}

    	return null;
	}

	public static Machine findMachineByName(String name)
	{
		Iterator it = Machines.entrySet().iterator();
  		while (it.hasNext()) {
        	Map.Entry<Integer, ArrayList<Machine>> pair = (Map.Entry)it.next();
        	for (Machine machine : pair.getValue())
        		if (machine.getName() == name)
        			return machine;
        }

        return null;
	}

	public static boolean removeMachine(Machine input)
	{
		ArrayList<Machine> list = Machines.get(input.getType());
		for (Machine machine : list)
			if (machine == input)
			{
				list.remove(machine);
				return true;
			}

		return false;
	}

	public static int getAmount(int type)
	{
		int bAmount = 0;
		ArrayList<Machine> list = Machines.get(type);
		for (Machine machine : list)
			bAmount++;

		return bAmount;
	}

	public int getID()
	{
		return m_bID;
	}

	public String getName()
	{
		return m_sName;
	}

	public int getType()
	{
		return m_bType;
	}

	public abstract void usage();
}

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