package chsungyesuzuki.util;

public class Util{

	public static int[] getIntegerArrayFromString(String frommer){
		int frommerLength = frommer.length();
		int[] result = new int[frommerLength];
		for(int i = 0;i < frommerLength;i++){
			String temp = frommer.substring(i, i+1);
			result[i] = Integer.valueOf(temp);
		}
		return result;
	}
}
