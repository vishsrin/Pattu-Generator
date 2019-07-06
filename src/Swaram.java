import org.jfugue.pattern.Pattern;

public class Swaram {
	private String name;
	private int length;
	
	public Swaram(String name, int length)
	{
		//System.out.println(name);
		this.name = name;
		this.length = length;
	}
	
	public void play(Ragam ragam, Pattern song)
	{
		ragam.play(name, length, song);
	}

}
