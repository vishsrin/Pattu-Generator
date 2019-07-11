import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String path = "/Users/vishnu/Documents/GitHub/pattuStuff/songFiles/HamsadhwaniVarnam.txt";
		
		SongPlayer player = new SongPlayer(path);
		
		//player.play(600);
		
		player.generateRandom("/Users/vishnu/Documents/GitHub/pattuStuff/songFiles/HamsadhwaniVarnamRandomSwaram.txt", 3);
		
		SongPlayer swaramPlayer = new SongPlayer("/Users/vishnu/Documents/GitHub/pattuStuff/songFiles/HamsadhwaniVarnamRandomSwaram.txt");
		swaramPlayer.play(100);

	}

}
