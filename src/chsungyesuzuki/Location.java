package chsungyesuzuki;

public class Location{
	public String board;
	public String number;
	private static long waterNumber;
	public Location(String board,String number){
		this.board = board;
		this.number = number;
	}
	public static long getWaterNumber(){
		long result = waterNumber;
		waterNumber ++;
		return result;
	}
}
