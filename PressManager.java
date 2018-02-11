package chsungyesuzuki;
import java.util.Map;
import java.util.HashMap;
import chsungyesuzuki.Press;
import chsungyesuzuki.ISBN;
import chsungyesuzuki.ISBNManager;

public final class PressManager {
	private static Map<Press, String> presses = new HashMap();
	
	private PressManager() {
	}
	
	public static Press getInstanceAndCreateNew(String name, String pressNumber) {
		Press result = new Press(name, pressNumber);
		presses.put(result, pressNumber);
		return result;
	}
	public static void remove(Press key) {
		presses.remove(key);
	}
	
	public static String getNumberInPress(Press press) {
		return presses.get(press);
	}
	
	public static ISBN getISBNInBookNumberInPress(Press press, String country, String other) {
		String iSBNFront = "978" + country + getNumberInPress(press) + other;
		String iSBNBack = ISBNManager.getBack(iSBNFront);
		String iSBN = iSBNFront + iSBNBack;
		ISBN result = new ISBN(iSBN);
		return result;
	}
}
