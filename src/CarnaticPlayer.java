import java.util.ArrayList;
import java.util.Arrays;

import org.jfugue.player.Player;

public class CarnaticPlayer {
	Player player;

	public CarnaticPlayer() {
		player = new Player();
	}

	public void play(Ragam ragam, String swaramsToPlay, int speed) {
		ArrayList<String> swarams = makeArrayList(swaramsToPlay);

		String toPlay = "T" + speed + " ";
		for (String swaram : swarams) {
			if (swaram.equalsIgnoreCase(",")) {
				toPlay = increaseLengthLastNote(toPlay);
			} else {
				toPlay = toPlay + ragam.getNote(swaram) + " ";
			}
		}

		player.play(toPlay);
	}
	
	public String increaseLengthLastNote(String notes)
	{
		ArrayList<String> list = makeArrayList(notes);
		
		String lastNote = list.remove(list.size() - 1);
		
		list.add(makeLonger(lastNote));
		
		return makeString(list);
	}
	
	public String makeLonger(String note)
	{
		char[] Chararray = note.toCharArray();
		Character noteLength = Chararray[Chararray.length - 1];
		if(noteLength.equals('q'))
		{
			Chararray[Chararray.length - 1] = 'h';
			return new String(Chararray);
		}
		else if(noteLength.equals('h'))
		{
			return note + ".";
		}
		else if(noteLength.equals('.'))
		{
			char[] Chararray2 = new char[Chararray.length - 1];
			
			for(int i = 0; i < Chararray2.length - 1; i++)
			{
				Chararray2[i] = Chararray[i];
			}
			
			Chararray2[Chararray2.length - 1] = 'w';
			return new String(Chararray2);
		}
		else
		{
			return "problem";
		}
		
	}
	
	public String makeString(ArrayList<String> list)
	{
		String toReturn = "";
		for(String elem : list)
		{
			toReturn = toReturn + elem + " ";
		}
		return toReturn;
	}

	public ArrayList<String> makeArrayList(String string) {
		ArrayList<String> toReturn = new ArrayList<String>(Arrays.asList(string.split(" ")));
		return toReturn;
	}
}
