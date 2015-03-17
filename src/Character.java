import java.util.ArrayList;


public class Character {

	private int strength = 10;
	private int dexterity = 10;
	private int constitution = 10;
	private int intelligence = 10;
	private int wisdom = 10;
	private int charisma = 10;
	
	private String name = "";
	private String title = "Fighter";
	private Race race;
	private int level = 1;
	private int hitpoints = 1;
	private int xp = 0;
	private int ac = 10;
	private int gold = 0;
	
	private ArrayList<Item> inventory = new ArrayList<Item>();
	
	//Constructor
	public Character(){
		for(int i = 0; i < 7; i++){
			switch(i){
				case 1: int r1 = (3*((int)(1+Math.random()*6))); if(r1>10){this.strength=r1;}
					break;
				case 2: int r2 = (3*((int)(1+Math.random()*6))); if(r2>10){this.dexterity=r2;}
					break;
				case 3: int r3 = (3*((int)(1+Math.random()*6))); if(r3>10){this.constitution=r3;}
					break;
				case 4: int r4 = (3*((int)(1+Math.random()*6))); if(r4>10){this.intelligence=r4;}
					break;
				case 5: int r5 = (3*((int)(1+Math.random()*6))); if(r5>10){this.wisdom=r5;}
					break;
				case 6: int r6 = (3*((int)(1+Math.random()*6))); if(r6>10){this.charisma=r6;}
					break;
				default: break;
			}
		}
		
		
		int r = ((int)(1+Math.random()*5));
		switch(r){
		case 1: this.race = Race.DWARF;
			break;
		case 2: this.race = Race.ELF;
			break;
		case 3: this.race = Race.GNOME;
			break;
		case 4: this.race = Race.HALFLING;
			break;
		case 5: this.race = Race.HUMAN;
			break;
		default: this.race = Race.DWARF;
			break;
		}
		
		
		r = ((int)(1+Math.random()*5));
		switch(r){
		case 1: this.title = "Fighter"; this.hitpoints = 10+getConstitution()-10;
			break;
		case 2: this.title = "Theif"; this.hitpoints = 6+getConstitution()-10;
			break;
		case 3: this.title = "Cleric"; this.hitpoints = 8+getConstitution()-10;
			break;
		case 4: this.title = "Mage"; this.hitpoints = 4+getConstitution()-10;
			break;
		case 5: this.title = "Bard"; this.hitpoints = 6+getConstitution()-10;
			break;
		default: this.title = "Fighter"; this.hitpoints = 10+getConstitution()-10;
			break;
		}
		
		String[] possibleNames ={"Omen","Fenrick","Gigamesh","Ogris","Rogen","Draven","Tor","Tovak","Grix","Brutus",
								 "Nigel","Glahad","Gwain","Ank","Aaron","Sparrow","Krish","Harold","Hermes","Prote",
								 "Newton","Edward","Steven","William","Jack","Araney","Xia","Ellara","Jasmin","Helga"};
		
		this.name = possibleNames[((int)(Math.random()*possibleNames.length))]+" the "+this.title;
		this.gold = 10*((int)(2+Math.random()*20));
	}// End Constructor

	
	public int getAc() {
		return ac;
	}


	public void setAc(int ac) {
		this.ac = ac;
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getStrength() {
		// If this race gets a bonus to strength than add it
		if(race.getRacialAdjustment().containsKey(Skill.STRENGTH))
		{
			return  strength + race.getRacialAdjustment().get(Skill.STRENGTH);
		}
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		// If this race gets a bonus to dexterity than add it
		if(race.getRacialAdjustment().containsKey(Skill.DEXTERITY))
		{
			return  dexterity + race.getRacialAdjustment().get(Skill.DEXTERITY);
		}
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		// If this race gets a bonus to constitution than add it
		if(race.getRacialAdjustment().containsKey(Skill.CONSTITUTION))
		{
			return  constitution + race.getRacialAdjustment().get(Skill.CONSTITUTION);
		}
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		// If this race gets a bonus to intelligence than add it
		if(race.getRacialAdjustment().containsKey(Skill.INTELLIGENCE))
		{
			return  intelligence + race.getRacialAdjustment().get(Skill.INTELLIGENCE);
		}
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		// If this race gets a bonus to wisdom than add it
		if(race.getRacialAdjustment().containsKey(Skill.WISDOM))
		{
			return  wisdom + race.getRacialAdjustment().get(Skill.WISDOM);
		}
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		// If this race gets a bonus to charisma than add it
		if(race.getRacialAdjustment().containsKey(Skill.CHARISMA))
		{
			return  charisma + race.getRacialAdjustment().get(Skill.CHARISMA);
		}
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return name+" Lv: "+level+" Hp: "+hitpoints+" \n"+
				"Race: "+race.getName()+"\n"+
				"GOLD: "+gold+"\n"+
				"STR ["+getStrength()+"]\n"+
				"DEX ["+getDexterity()+"]\n"+
				"CON ["+getConstitution()+"]\n"+
				"INT ["+getIntelligence()+"]\n"+
				"WIS ["+getWisdom()+"]\n"+
				"CHR ["+getCharisma()+"]";
	}
	
	
	
}
