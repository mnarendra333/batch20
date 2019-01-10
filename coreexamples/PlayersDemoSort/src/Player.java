public class Player /*implements Comparable<Player>*/{

	private int plyId;
	private String playerName;
	private int score;
	private int age;
	private int wickets;

	public Player(int plyId, String playerName, int score, int age, int wickets) {
		super();
		this.plyId = plyId;
		this.playerName = playerName;
		this.score = score;
		this.age = age;
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Player [plyId=" + plyId + ", playerName=" + playerName
				+ ", score=" + score + ", age=" + age + ", wickets=" + wickets
				+ "]";
	}

	public int getPlyId() {
		return plyId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getScore() {
		return score;
	}

	public int getAge() {
		return age;
	}

	public int getWickets() {
		return wickets;
	}

	/*@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		Integer i1 = this.getScore();
		Integer i2 = o.getScore();
		return -i1.compareTo(i2);
	}*/

}
