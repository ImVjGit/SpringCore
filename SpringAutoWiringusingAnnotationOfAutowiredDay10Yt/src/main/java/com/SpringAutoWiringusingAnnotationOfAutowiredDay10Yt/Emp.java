package com.SpringAutoWiringusingAnnotationOfAutowiredDay10Yt;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	// option 1 using property
	// @Autowired
	private Address address;

	// option 2 using constructor
	@Autowired
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
