package chsungyesuzuki;
import chsungyesuzuki.BitsException;
public class ISBN {
	private String iSBN;
	public ISBN(String iSBN) {
		this.iSBN = iSBN;
	}
	public String getISBN() {
		return iSBN;
	}
	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}
	public static String getBack(String front) {
		String result = new String();
		int back;
		int[] frontInteger = chsungyesuzuki.Util.getIntegerArrayFromString(front);
		int frontIntegerLength = frontInteger.length;
		if(frontIntegerLength == 12) {
			back = getBackInThirteen(frontInteger);
			result = String.valueOf(back);
			return result;
		}
		else if(frontIntegerLength == 9) {
			back = getBackInTen(frontInteger);
			result = String.valueOf(back);
			return result;
		}else {
			throw new BitsException(frontIntegerLength);
		}
	}
	private static int getBackInTen(int[] front) {
		int result;
		int[] poweredFront = new int[front.length];
		for(int i = 0;i < front.length;i ++) {
			int power = getPowerInTen(i);
			poweredFront[i] = front[i] * power;
		}
		int temp = 0;
		for(int i : poweredFront) {
			temp += i;
		}
		result = 11 - (temp % 11);
		return result;
	}
	private static int getPowerInTen(int i) {
		int result;
		result = 10 - i;
		return result;
	}
	private static int getBackInThirteen(int[] front) {
		int result;
		int[] poweredFront = new int[front.length];
		for(int i = 0;i < front.length;i ++) {
			int power = getPowerInThirteen(i);
			poweredFront[i] = front[i] * power;
		}
		int temp = 0;
		for(int i : poweredFront) {
			temp += i;
		}
		result = 10 - (temp % 10);
		return result;
	}
	private static int getPowerInThirteen(int i) {
		int iPercentTwo = i % 2;
		boolean iIsBima = iPercentTwo == 0;
		int power;
		if(iIsBima) {
			power = 1;
		}else {
			power = 3;
		}
		return power;
	}
	public String toString() {
		return iSBN;
	}
}
