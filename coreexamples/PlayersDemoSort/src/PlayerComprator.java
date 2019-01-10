import java.util.Comparator;


public class PlayerComprator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		int i1 = p1.getScore();
		int i2 = p2.getScore();
		return i1<i2?1:i1==i2?p1.getPlayerName().compareTo(p2.getPlayerName()):-1;
	}

}
