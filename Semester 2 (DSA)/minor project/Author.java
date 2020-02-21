
public class Author {
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender)
	{
		this.name = name;
		this.setEmail(email);
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public String toString()
	{
		String s = "Author[name="+name+",email="+email+",gender="+gender+"]";
		return s;
	}
	

}




// Designed by Ayush Kejariwal

