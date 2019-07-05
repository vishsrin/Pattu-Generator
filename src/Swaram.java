
public class Swaram {
	private String name;
	private int length;
	
	public Swaram(String name, int length)
	{
		//System.out.println(name);
		this.name = name;
		this.length = length;
	}
	
	public String play(Ragam ragam)
	{
		return ragam.play(name, length);
	}

}
