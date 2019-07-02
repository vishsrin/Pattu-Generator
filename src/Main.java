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
		scale.add("N3");
		scale.add("S.");
		Ragam Kalyani = new Ragam(scale);
		Kalyani.play("P P G P M R M G M P D N S. P D P M G R G S R S.");

	}

}
