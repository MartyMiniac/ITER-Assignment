
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;
	Book(String name,Author author,double price)
	{
		this.name = name;
		this.author = author;
		this.setPrice(price);
	}
	Book(String name,Author author,double price,int qty)
	{
		this.name = name;
		this.author = author;
		this.setPrice(price);
		this.setQty(qty);
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString()
	{
		String s = "Book[name="+name+","+author.toString()+",price="+price+",qty="+qty;
		return s;
	}

}




// Designed by Ayush Kejariwal

