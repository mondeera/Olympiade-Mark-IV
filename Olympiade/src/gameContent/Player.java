package gameContent;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Player {
	
	private int id;
	
	private int playerpoints = 0;
	private int skillpoints = 0;
	private int games = 0;
	private int value = 0;
	private int salary = 0;
	private int contract = 0;
	private String name = "n.v.";
	
	
	private ImageIcon icon = null;
	private String story =  "n.v.";
	
	private int ausdauer = 0; //TODO wird iwann in englisch ge�ndert
	
	private int stamina = 0;
	private int power = 0;
	private int health = 0;
	private int intelligence = 0;
	private int awareness = 0;
	private int determination = 0;
	private int speed = 0;
	private int dexterity = 0;
	private int charisma = 0;
	private int will = 0;
	private int torment = 0;
	private int spirit = 0;
	private String heroClass = "n.v.";
	private String alignment = "n.v.";

	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public String [] getStatArray(){ 
		// + "" castet zu String
		String [] stats = { games+ "", playerpoints+ "", stamina+ "", value+"", salary+"" , contract+""};
		return stats;
	}

	public String getStory(){
		return story;
	}
	
	public void setStory(String story) {
		this.story = story;
	}

	public int getStamina() {
		return stamina;
	}


	public void setStamina(int stamina) {
		this.stamina = stamina;
	}


	public int getPlayerpoints() {
		return playerpoints;
	}


	public void setPlayerpoints(int playerpoints) {
		this.playerpoints = playerpoints;
	}
	
	public int getSkillpoints() {
		return skillpoints;
	}


	public void setSkillpoints(int skillpoints) {
		this.skillpoints = skillpoints;
	}


	public int getGames() {
		return games;
	}


	public void setGames(int games) {
		this.games = games;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getContract() {
		return contract;
	}


	public void setContract(int contract) {
		this.contract = contract;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public String[] getValues() {
		String [] values = {value+ "", salary+ "", contract+""};
		return values;
	}

	public int [] getPlayerStats() {
		int [] stats = {power,speed, health, dexterity, stamina, charisma, intelligence, will, awareness, spirit, determination, torment};
		
		return stats;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int getAusdauer() {
		return ausdauer;
	}

	public void setAusdauer(int ausdauer) {
		this.ausdauer = ausdauer;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getAwareness() {
		return awareness;
	}

	public void setAwareness(int awareness) {
		this.awareness = awareness;
	}

	public int getDetermination() {
		return determination;
	}

	public void setDetermination(int determination) {
		this.determination = determination;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getWill() {
		return will;
	}

	public void setWill(int will) {
		this.will = will;
	}

	public int getTorment() {
		return torment;
	}

	public void setTorment(int torment) {
		this.torment = torment;
	}

	public String getHeroClass() {
		return heroClass;
	}

	public void setHeroClass(String heroClass) {
		this.heroClass = heroClass;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String string) {
		this.alignment = string;
	}

	public int getSpirit() {
		return spirit;
	}

	public void setSpirit(int spirit) {
		this.spirit = spirit;
	}

	
	

}
