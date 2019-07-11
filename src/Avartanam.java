import java.util.ArrayList;
import java.util.Arrays;

import org.jfugue.pattern.Pattern;

public class Avartanam {
	private ArrayList<Swaram> swaramList;

	public Avartanam(String line) {
	//	System.out.println(line);

		ArrayList<String> swaramStringList = makeArrayList(line);

		swaramList = makeSwaramList(swaramStringList);
	}

	public ArrayList<String> makeArrayList(String string) {
		ArrayList<String> toReturn = new ArrayList<String>(Arrays.asList(string.split(" ")));
		return toReturn;
	}

	public ArrayList<Swaram> makeSwaramList(ArrayList<String> swaramStringList) {
		//System.out.println(swaramStringList);
		ArrayList<Swaram> toReturn = new ArrayList<Swaram>();

		String thisSwaram;
		String nextSwaram;
		for (int i = 0; i < swaramStringList.size(); i++) {
			thisSwaram = swaramStringList.get(i);
			//System.out.println("thisSwaram = " + thisSwaram);
			int swaramLength = 1;
			if (thisSwaram.equalsIgnoreCase(",")) {
				//System.out.println("comma detected");
			} else {
				if (i == swaramStringList.size() - 1) {
					toReturn.add(new Swaram(thisSwaram, swaramLength));
				} else {
					nextSwaram = swaramStringList.get(i + 1);
					int nextIndex = i + 1;

					//System.out.println(thisSwaram);
							
					while (nextSwaram.equalsIgnoreCase(",")) {
						//System.out.println("next swaram is " + nextSwaram);
						swaramLength++;
						//System.out.println("swaram length increased");
						if (nextIndex == swaramStringList.size() - 1) {
							nextSwaram = "done";
						} else {
							nextIndex++;
							nextSwaram = swaramStringList.get(nextIndex);
						}
					}
					//System.out.println(swaramLength);

					toReturn.add(new Swaram(thisSwaram, swaramLength));
				}
			}

		}

		return toReturn;
	}

	public void play(Ragam ragam, Pattern song) {

		for (Swaram swaram : swaramList) {
			swaram.play(ragam, song);
		}
	}
}
