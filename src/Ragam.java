import java.util.ArrayList;
import java.util.Arrays;

import org.jfugue.player.Player;

public class Ragam {
	private ArrayList<String> westernScale;
	
	public Ragam(ArrayList<String> scale)
	{
		this.westernScale = westernifyScale(scale);
	}
	
	public ArrayList<String> westernifyScale(ArrayList<String> carnaticScale)
	{
		ArrayList<String> toReturn = new ArrayList<String>();
		for(String swaram : carnaticScale)
		{
			toReturn.add(westernifySwaram(swaram));
		}
		
		return toReturn;
	}
	
	public void playRagam()
	{
		Player player = new Player();
		player.play(makeString(westernScale));
	}
	
	public void play(String swaramSequence)
	{
		ArrayList<String> notesToPlay = makeArrayList(swaramSequence);
		String toPlay = "";
		String lastSwaramPlayed = "";
		
		for(String swaram : notesToPlay)
		{
			toPlay = toPlay + findNoteinScale(swaram, lastSwaramPlayed) + " ";
			lastSwaramPlayed = findNoteinScale(swaram, lastSwaramPlayed);
		}
		
		Player player = new Player();
		player.play(toPlay);
	}
	
	public ArrayList<String> makeArrayList(String string)
	{
		ArrayList<String> toReturn = new ArrayList<String>(Arrays.asList(string.split(" ")));
		return toReturn;
	}
	
	public String findNoteinScale(String swaram, String lastSwaram)
	{
		if(swaram.equalsIgnoreCase("S"))
		{
			return westernScale.get(0);
		}
		else if(swaram.equalsIgnoreCase("R"))
		{
			return westernScale.get(1);
		}
		else if(swaram.equalsIgnoreCase("G"))
		{
			return westernScale.get(2);
		}
		else if(swaram.equalsIgnoreCase("M"))
		{
			return westernScale.get(3);
		}
		else if(swaram.equalsIgnoreCase("P"))
		{
			return westernScale.get(4);
		}
		else if(swaram.equalsIgnoreCase("D"))
		{
			return westernScale.get(5);
		}
		else if(swaram.equalsIgnoreCase("N"))
		{
			return westernScale.get(6);
		}
		else if(swaram.equalsIgnoreCase("S."))
		{
			return westernScale.get(7);
		}
		else if(swaram.equalsIgnoreCase(","))
		{
			return findNoteinScale(lastSwaram, lastSwaram);
		}
		else
		{
			return "beep beep beep problem";
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
	
	public String westernifySwaram(String swaram)
	{
		if(swaram.equalsIgnoreCase(".S"))
		{
			return "C3";
		}
		else if(swaram.equalsIgnoreCase("S"))
		{
			return "C4";
		}
		else if(swaram.equalsIgnoreCase("S."))
		{
			return "C5";
		}
		else if(swaram.equalsIgnoreCase(".R1"))
		{
			return "C#3";
		}
		else if(swaram.equalsIgnoreCase("R1"))
		{
			return "C#4";
		}
		else if(swaram.equalsIgnoreCase("R1."))
		{
			return "C#5";
		}
		else if(swaram.equalsIgnoreCase(".R2"))
		{
			return "D3";
		}
		else if(swaram.equalsIgnoreCase("R2"))
		{
			return "D4";
		}
		else if(swaram.equalsIgnoreCase("R2."))
		{
			return "D5";
		}
		else if(swaram.equalsIgnoreCase(".R3"))
		{
			return "D#3";
		}
		else if(swaram.equalsIgnoreCase("R3"))
		{
			return "D#4";
		}
		else if(swaram.equalsIgnoreCase("R3."))
		{
			return "D#5";
		}
		else if(swaram.equalsIgnoreCase(".G1"))
		{
			return westernifySwaram(".R2");
		}
		else if(swaram.equalsIgnoreCase("G1"))
		{
			return westernifySwaram("R2");
		}
		else if(swaram.equalsIgnoreCase("G1."))
		{
			return westernifySwaram("R2.");
		}
		else if(swaram.equalsIgnoreCase(".G2"))
		{
			return westernifySwaram(".R3");
		}
		else if(swaram.equalsIgnoreCase("G2"))
		{
			return westernifySwaram("R3");
		}
		else if(swaram.equalsIgnoreCase("G2."))
		{
			return westernifySwaram("R3.");
		}
		else if(swaram.equalsIgnoreCase(".G3"))
		{
			return "E3";
		}
		else if(swaram.equalsIgnoreCase("G3"))
		{
			return "E4";
		}
		else if(swaram.equalsIgnoreCase("G3."))
		{
			return "E5";
		}
		else if(swaram.equalsIgnoreCase(".M1"))
		{
			return "F3";
		}
		else if(swaram.equalsIgnoreCase("M1"))
		{
			return "F4";
		}
		else if(swaram.equalsIgnoreCase("M1."))
		{
			return "F5";
		}
		else if(swaram.equalsIgnoreCase(".M2"))
		{
			return "F#3";
		}
		else if(swaram.equalsIgnoreCase("M2"))
		{
			return "F#4";
		}
		else if(swaram.equalsIgnoreCase("M2."))
		{
			return "F#5";
		}
		else if(swaram.equalsIgnoreCase(".P"))
		{
			return "G3";
		}
		else if(swaram.equalsIgnoreCase("P"))
		{
			return "G4";
		}
		else if(swaram.equalsIgnoreCase("P."))
		{
			return "G5";
		}
		else if(swaram.equalsIgnoreCase(".D1"))
		{
			return "G#3";
		}
		else if(swaram.equalsIgnoreCase("D1"))
		{
			return "G#4";
		}
		else if(swaram.equalsIgnoreCase("D1."))
		{
			return "G#5";
		}
		else if(swaram.equalsIgnoreCase(".D2"))
		{
			return "A3";
		}
		else if(swaram.equalsIgnoreCase("D2"))
		{
			return "A4";
		}
		else if(swaram.equalsIgnoreCase("D2."))
		{
			return "A5";
		}
		else if(swaram.equalsIgnoreCase(".D3"))
		{
			return "A#3";
		}
		else if(swaram.equalsIgnoreCase("D3"))
		{
			return "A#4";
		}
		else if(swaram.equalsIgnoreCase("D3."))
		{
			return "A#5";
		}
		else if(swaram.equalsIgnoreCase(".N1"))
		{
			return westernifySwaram(".D2");
		}
		else if(swaram.equalsIgnoreCase("N1"))
		{
			return westernifySwaram("D2");
		}
		else if(swaram.equalsIgnoreCase("N1."))
		{
			return westernifySwaram("D2.");
		}
		else if(swaram.equalsIgnoreCase(".N2"))
		{
			return westernifySwaram(".D3");
		}
		else if(swaram.equalsIgnoreCase("N2"))
		{
			return westernifySwaram("D3");
		}
		else if(swaram.equalsIgnoreCase("N2."))
		{
			return westernifySwaram("D3.");
		}
		else if(swaram.equalsIgnoreCase(".N3"))
		{
			return "B3";
		}
		else if(swaram.equalsIgnoreCase("N3"))
		{
			return "B4";
		}
		else if(swaram.equalsIgnoreCase("N3."))
		{
			return "B5";
		}
		else
		{
			return "problem";
		}
	}

}
