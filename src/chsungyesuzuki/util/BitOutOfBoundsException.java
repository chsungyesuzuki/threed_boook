package chsungyesuzuki.util;

public class BitOutOfBoundsException extends IndexOutOfBoundsException{
	private static final long serialVersionUID = 64156415641894L;

	public BitOutOfBoundsException(int bit){
		super("you typed wrong bit!it's" + String.valueOf(bit) + "but it must be 10 XOR 13!");
	}
}
