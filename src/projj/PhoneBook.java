package projj;

public class PhoneBook {
	String phNo;
	String Name;
	String address;
	public PhoneBook(String phNo,String Name,String address) {
		this.phNo=phNo;
		this.Name=Name;
		this.address=address;
	}
	public String getphNo() {
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
