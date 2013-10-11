package gameContent;

//TODO schauen ob wir die ids brauchen
public class Team {
	
	private String name;
	private String shortName;
	private int salary;
	private int rank;
	private String captain;
	

	public Team(String name, String shortName, int id, int salary, int rank, String captain) {
		this.name = name;
		this.shortName = shortName;
		this.salary = salary;
		this.rank = rank;
		this.captain = captain;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getShortName() {
		return shortName;
	}


	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getCaptain() {
		return captain;
	}


	public void setCaptain(String captain) {
		this.captain = captain;
	}

}