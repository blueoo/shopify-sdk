package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyAssignedLocation {

	private String address1;
	private String address2;
	private String city;

	@XmlElement(name = "country_code")
	private String countryCode;

	@XmlElement(name = "location_id")
	private String locationId;

	private String name;
	private String phone;
	private String province;
	private String zip;

	public String getName() {
		return name;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getZip() {
		return zip;
	}

	public String getPhone() {
		return phone;
	}

	public String getProvince() {
		return province;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setAddress1(final String address1) {
		this.address1 = address1;
	}

	public void setAddress2(final String address2) {
		this.address2 = address2;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public void setZip(final String zip) {
		this.zip = zip;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public void setProvince(final String province) {
		this.province = province;
	}

	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
}
