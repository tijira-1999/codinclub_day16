import java.util.*;
public class AddressBook {

	private LinkedList<Address> addressList;

	public AddressBook() {
		addressList = new LinkedList<>();
	}

	public void addAddress(String firstName, String lastName, String address, String city, String state, String zip, String phone) {
		Address addr = new Address(firstName,lastName,address,city,state,zip,phone);
		addressList.add(addr);
	}
	public void showAddress() {
		for (int i=0;i<addressList.size();i++) {
			Address ad = addressList.get(i);
			System.out.println("\n"+ad);
		}
	}
	public void showAddressSorted() {
		Collections.sort(addressList, Address.addressComparator);
		for (Address a: addressList) {
			System.out.println("\n"+a);
		}
	}

	public static void main(String[] args) {
		AddressBook a = new AddressBook();
		a.addAddress("Ram","Kumar","Netaji nagar","bhubaneswar","Odisha","751002","1234567890");
		a.addAddress("Asiaz","ubeki","dinkispur","Ramziah","MadhyaPradesh","7556222","9994235890");
		a.addAddress("Ajay","sharma","santhpur","Jamshedpur","Chattisgarh","750022","1111567890");
		a.addAddress("Bikash","chandra","lewis colony","Bangalore","Karnataka","751132","9994678903");
		a.showAddress();
		System.out.println("Address in sorted order by lastname is");
		a.showAddressSorted();
	}
}

