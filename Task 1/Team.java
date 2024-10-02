import java.util.ArrayList;
class Team{
	
	private String teamName;
	private int rank;
	private String memberName;



	public Team(String name){
		this.teamName = name;

	}

	public void setRank(int rank){
		this.rank = rank;
	}

	@Override
	public String toString(){
		String t = "Hold: " + this.teamName + "Rank: "+ this.rank + "Nanv:" + playerNames;
		return t;
	}

	private ArrayList<String> playerNames = new ArrayList<String>();

	public void addPlayer(String name){
		playerNames.add(name);

	}


}
