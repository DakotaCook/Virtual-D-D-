import java.util.HashMap;


public class Race {
	// Create some HashMaps to store each race's racial adjustments in
	private static final HashMap<Skill, Integer> dwarfAdjustment = new HashMap<Skill, Integer>();
	private static final HashMap<Skill, Integer> elfAdjustment = new HashMap<Skill, Integer>();
	private static final HashMap<Skill, Integer> gnomeAdjustment = new HashMap<Skill, Integer>();
	private static final HashMap<Skill, Integer> halflingAdjustment = new HashMap<Skill, Integer>();
	private static final HashMap<Skill, Integer> humanAdjustment = new HashMap<Skill, Integer>();
	
	// Add all the adjustments for each race
	static {
		dwarfAdjustment.put(Skill.CHARISMA, 1);
		dwarfAdjustment.put(Skill.CHARISMA, -1);
		elfAdjustment.put(Skill.DEXTERITY, 1);
		elfAdjustment.put(Skill.CONSTITUTION, -1);
		gnomeAdjustment.put(Skill.INTELLIGENCE, 1);
		gnomeAdjustment.put(Skill.WISDOM, -1);
		halflingAdjustment.put(Skill.DEXTERITY, 1);
		halflingAdjustment.put(Skill.STRENGTH, -1);
	}
	
	// The Races
	/** The race of the Dwarfs they have +1 constitution; -1 charisma */
	public static final Race DWARF = new Race("Dwarf", dwarfAdjustment);
	/** The race of the Elves they have +1 dexterity; -1 constitution */
	public static final Race ELF = new Race("Elf", elfAdjustment);
	/** The race of the Gnomes they have +1 intelligence; -1 wisdom */
	public static final Race GNOME = new Race("Gnome", gnomeAdjustment);
	/** The race of the Halflings they have +1 intelligence; -1 wisdom */
	public static final Race HALFLING = new Race("Halfling", halflingAdjustment);
	/** The race of the Dwarfs they have +1 dexterity; -1 strength */
	public static final Race HUMAN = new Race("Human", humanAdjustment);
			
	private final String name;
	private final HashMap<Skill, Integer> racialAdjustment;
	
	/**
	 * Constructor used to create a Race
	 * @param name - The name of the race
	 * @param racialAdjustment - A HashMap containing all the ability modifiers for the given race
	 */
	Race(String name, HashMap<Skill, Integer> racialAdjustment) {
		this.name = name;
		this.racialAdjustment = racialAdjustment;
	}
	
	/** @return The name of the race */
	public String getName() {
		return name;
	}
	
	/** @return A HashMap containing all the ability modifiers for the given race. <br /> 
	 * I.e. Dwarf has plus 1 to constitution and -1 to charisma*/
	public HashMap<Skill, Integer> getRacialAdjustment() {
		return racialAdjustment;
	}
}
