import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String path = "/Users/vishnu/Documents/GitHub/pattuStuff/songFiles/HamsadhwaniVarnam.txt";
		
		SongPlayer player = new SongPlayer(path);
		
		player.play(400);

	}

}
