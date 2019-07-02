import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> scale = new ArrayList<String>();
		scale.add("S");
		scale.add("R2");
		scale.add("G3");
		scale.add("M2");
		scale.add("P");
		scale.add("D2");
		scale.add("N3");
		scale.add("S");
		Ragam Kalyani = new Ragam(scale);
		CarnaticPlayer player = new CarnaticPlayer();
		player.play(Kalyani, "S. S. , S. N D R. S. N N D D P M G M P D N D , R. S. N D P M G M P D N", 150);

	}

}
