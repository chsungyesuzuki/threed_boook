package chsungyesuzuki;
import chsungyesuzuki.ISBN;
import chsungyesuzuki.Press;
import chsungyesuzuki.Location;
import java.util.Calendar;
public class Book {
	public String name;
	public String author;
	public Location location;
	public byte edition;
	public ISBN iSBN;
	public Press press;
	public Calendar date;
	public float price;
	public Book(){
	}
	public Book(String name,String author,Location location) {
		this.name = name;
		this.author = author;
		this.location = location;
	}
	public String toString() {
		String result = new String();
		result = "name:" + name + "author:" + author + "location:" + location.toString() + "ISBN:" + iSBN.toString();
		return result;
	}
}
