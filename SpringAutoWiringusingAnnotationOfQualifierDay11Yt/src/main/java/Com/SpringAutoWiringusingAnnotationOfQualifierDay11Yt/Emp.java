package Com.SpringAutoWiringusingAnnotationOfQualifierDay11Yt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	// option 1 using property
	@Autowired
	@Qualifier("address1") // its only inject or search this name of bean
	private Address address;

	// option 2 using constructor
	// @Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	// option 3 using setter
	// @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
