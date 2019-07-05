
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FiletoString {
	private File file;
	private Scanner sc;

	public FiletoString(String fileName) throws FileNotFoundException {
		file = new File(fileName);
		sc = new Scanner(file);
	}
	
	public boolean hasNextLine()
	{
		return sc.hasNextLine();
	}

	public String nextFileLine() throws Exception {
		ArrayList<String> toReturn = new ArrayList<String>();
		
		return sc.nextLine();
	}

}
