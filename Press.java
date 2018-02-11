package chsungyesuzuki;
import java.util.Map;
import java.util.HashMap;
import chsungyesuzuki.ISBN;
public class Press {
	private static Map<Press, String> presses = new HashMap();
	private String name;
	private String pressNumber;
	public Press(String name, String pressNumber) {
		this.name = name;
		this.pressNumber = pressNumber;
	}
	public static Press getInstanceAndCreateNew(String name,String pressNumber) {
		Press result = new Press(name,pressNumber);
		presses.put(result, pressNumber);
		return result;
	}
	public static String getNumberInPress(Press press) {
		return presses.get(press);
	}
	public ISBN getISBNInBookNumberInPress(String country,String other) {
		String iSBNFront = "978" + country + Press.getNumberInPress(this) + other;
		String iSBNBack = ISBN.getBack(iSBNFront);
		String iSBN = iSBNFront + iSBNBack;
		ISBN result = new ISBN(iSBN);
		return result;
	}
	public String toString() {
		return getName();
	}
	public void remove(Press key) {
		presses.remove(key);
	}
}
