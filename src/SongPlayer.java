import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class SongPlayer {
	private FiletoString converter;
	private Ragam ragam;
	Player player;
	Pattern song;
	
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
		System.out.print("called");
		Pattern song = new Pattern("T" + speed + " V0 I[Violin] C4o- V1 I[Flute]");
		
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
		
		System.out.println(song);
		player.play(song);
	}
	
	public void generateRandom(String fileName, int numberofAvartanams) throws FileNotFoundException, UnsupportedEncodingException
	{
		PrintWriter writer = new PrintWriter(fileName, "UTF-8");
		writer.println(ragam.getFileNotation());
		
		for(int i = 0; i < numberofAvartanams; i++)
		{
		String toPrint = ragam.getRandomSwaram(true) + " ";
		
		for(int j = 0; j < 8; j++)
		{
			toPrint = toPrint + ragam.getRandomSwaram(false) + " ";
		}
		System.out.println(toPrint);
		writer.println(toPrint);
		
		}
		
		
		
		writer.close();
	}

}
