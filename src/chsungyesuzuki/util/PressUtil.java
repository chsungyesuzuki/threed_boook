package chsungyesuzuki.util;
import java.util.Map;
import java.util.HashMap;
import chsungyesuzuki.Press;
import chsungyesuzuki.util.ISBNUtil;

public final class PressUtil{
	private static Map<Press, String> presses = new HashMap<>();
	
	private PressUtil(){
	}
	
	public static Press getInstanceAndCreateNew(String name, String pressNumber){
		Press result = new Press(name, pressNumber);
		presses.put(result, pressNumber);
		return result;
	}
	public static void remove(Press key){
		presses.remove(key);
	}
	
	public static String getNumberInPress(Press press){
		return presses.get(press);
	}
	
	public static String getISBNInBookNumberInPress(Press press, String country, String other){
		String iSBNFront = "978" + country + getNumberInPress(press) + other;
		String iSBNBack = ISBNUtil.getBack(iSBNFront);
		String result = iSBNFront + iSBNBack;
		return result;
	}
}
