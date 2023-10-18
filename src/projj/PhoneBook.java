package projj;

public class PhoneBook {
	int phNo;
	String Name;
	String address;
	public PhoneBook(int phNo,String Name,String address) {
		this.phNo=phNo;
		this.Name=Name;
		this.address=address;
	}
	public int getphNo() {
		return phNo;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}
