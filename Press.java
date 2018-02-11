package chsungyesuzuki;
import java.util.Map;
import java.util.HashMap;
import chsungyesuzuki.ISBN;
public class Press {
	private static Map<Press,String> presses = new HashMap();
	private String name;
	private String pressNumber;
	public Press(String name,String pressNumber) {
		this.name = name;
		this.pressNumber = pressNumber;
	}
	public static Press getInstanceAndCreateNew(String name,String pressNumber) {
		Press instance = new Press(name,pressNumber);
		presses.put(instance, pressNumber);
		return instance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPressNumber() {
		return pressNumber;
	}
	public void setPressNumber(String pressNumber) {
		this.pressNumber = pressNumber;
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
		return this.getName();
	}
	public void remove(Press key) {
		presses.remove(key);
	}
}
