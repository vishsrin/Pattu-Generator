import java.util.ArrayList;

public class SongPlayer {
	private FiletoString converter;
	private Ragam ragam;
	CarnaticPlayer player;
	
	public SongPlayer(String path) throws Exception
	{
		converter = new FiletoString(path);
		String nextLine = converter.nextFileLine();
		//System.out.println(nextLine);
		ragam = new Ragam(nextLine);
		
		player = new CarnaticPlayer();
	}
	
	public void play(int speed) throws Exception
	{
		String song = "";
		
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
			song = song + avartanam.play(ragam);
		}
		
		player.play(ragam, song, speed);
	}

}
