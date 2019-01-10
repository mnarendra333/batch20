import java.util.Comparator;
import java.util.TreeSet;


public class PlayerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Player> ts = new TreeSet<Player>(new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				// TODO Auto-generated method stub
				return -((Integer)o1.getScore()).compareTo(o2.getScore());
			}
		});
		
		Player p1 = new Player(200, "Rohith", 2356, 28, 30);
		Player p2 = new Player(890, "Saachin", 12356, 37, 140);
		Player p3 = new Player(130, "Rahul", 2356, 28, 30);
		Player p4 = new Player(200, "Rayudu", 1356, 26, 70);
		Player p5 = new Player(500, "Dinesh", 1245, 30, 300);
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		
		System.out.println(ts);

	}

}
