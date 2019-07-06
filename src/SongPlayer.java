import java.util.ArrayList;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class SongPlayer {
	private FiletoString converter;
	private Ragam ragam;
	Player player;
	
	public SongPlayer(String path) throws Exception
	{
		converter = new FiletoString(path);
		String nextLine = converter.nextFileLine();
		//System.out.println(nextLine);
		ragam = new Ragam(nextLine);
		
		player = new Player();
	}
	
	public void play(int speed) throws Exception
	{
		Pattern song = new Pattern("T" + speed) ;
		
		ArrayList<Avartanam> avartanams = new ArrayList<Avartanam>();
		while(converter.hasNextLine())
		{	
			String nextLine = converter.nextFileLine();
			if(nextLine.equals(""))
			{}
			else
			{
				avartanams.add(new Avartanam(nextLine));
			}
		}
		
		for(Avartanam avartanam : avartanams)
		{
			avartanam.play(ragam, song);
		}
		
		player.play(song);
	}

}
