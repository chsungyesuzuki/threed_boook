package chsungyesuzuki;
import chsungyesuzuki.ISBN;
import chsungyesuzuki.Press;
import chsungyesuzuki.Location;
import java.util.Calendar;
public class Book {
	private String name;
	private String author;
	private byte edition;
	private Location location;
	private ISBN iSBN;
	private Press press;
	private Calendar date;
	private float price;
	public Book(String name,String author,Location location) {
		this.name = name;
		this.author = author;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public byte getEdition() {
		return edition;
	}
	public void setEdition(byte edition) {
		this.edition = edition;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ISBN getISBN() {
		return iSBN;
	}
	public void setISBN(ISBN iSBN) {
		this.iSBN = iSBN;
	}
	public Press getPress() {
		return press;
	}
	public void setPress(Press press) {
		this.press = press;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
		String result = new String();
		result = "name:" + name + "author:" + author + "location:" + location.toString() + "ISBN:" + iSBN.toString();
		return result;
	}
}
