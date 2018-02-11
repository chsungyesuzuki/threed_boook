package chsungyesuzuki;
import chsungyesuzuki.BitsException;
import chsungyesuzuki.Util;

public final class ISBNManager {
	public static String getBack(String front) {
		int back;
		int[] frontInteger = chsungyesuzuki.Util.getIntegerArrayFromString(front);
		return group(frontInteger);
	}
	
	private static String group(int[] frontInteger){
		String result;
		int frontIntegerLength = frontInteger.length;
		if(frontIntegerLength == 12) 
			result = getBackInThirteen(frontInteger);
		else if(frontIntegerLength == 9) 
			result = getBackInTen(frontInteger);
		else 
			throw new BitsException(frontIntegerLength);
		return result;
	}
	
	private static String getBackInThirteen(int[] front) {
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
		if(result == 10)
			return "0";
		else
			return String.valueOf(result);
	}
	private static int getPowerInThirteen(int i) {
		int iPercentTwo = i % 2;
		boolean iIsBima = iPercentTwo == 0;
		int power;
		if(iIsBima) 
			power = 1;
		else 
			power = 3;
		return power;
	}
	
	private static String getBackInTen(int[] front) {
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
		if(result == 10)
			return "X";
		else if(result == 11)
			return "0";
		else
			return String.valueOf(result);
	}
	private static int getPowerInTen(int i) {
		int result;
		result = 10 - i;
		return result;
	}
}
