import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> scale = new ArrayList<String>();
		scale.add("S");
		scale.add("R2");
		scale.add("G3");
		scale.add("M1");
		scale.add("P");
		scale.add("D2");
		scale.add("N2");
		scale.add("S");
		Ragam Harikambhoji = new Ragam(scale);
		CarnaticPlayer player = new CarnaticPlayer();
		player.play(Harikambhoji, "G , G , R , R , S S R R G G R R S R G R S R S .D S R G P G R S R", 150);

	}

}
