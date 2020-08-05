import java.util.*;
class Address {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phone;

	public Address(String firstName, String lastName, String address, String city, String state, String zip, String phone) {
		this.firstName=firstName;
		this.lastName=lastName;
	        this.address=address;
        	this.city=city;
	        this.state=state;
        	this.zip=zip;
	        this.phone=phone;
	}

	public static Comparator<Address> addressComparator = new Comparator<Address>() {
		public int compare(Address a1, Address a2) {
			String s1=a1.lastName.toUpperCase();
			String s2=a2.lastName.toUpperCase();

			return s1.compareTo(s2);
		}
	};

	@Override
	public String toString() {
		return "Address is \n" + firstName+" "+lastName+"\n"+address+"\n"+city+"\n"+state+"\n"+zip+"\n"+phone;
	}
}
