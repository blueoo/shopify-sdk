package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.ALWAYS)
public class ShopifyCustomerCreateRequest {

	private String email;
	@XmlElement(name = "first_name")
	private String firstName;
	@XmlElement(name = "last_name")
	private String lastname;
	private String phone;

	private ShopifyCustomerCreateRequest(final Steps steps) {
		this.email = steps.email;
		this.firstName = steps.firstName;
		this.lastname = steps.lastname;
		this.phone = steps.phone;
	}

	public static interface BuildStep {
		ShopifyCustomerCreateRequest build();
	}

	public static interface PhoneStep {
		BuildStep withPhone(final String phone);
	}

	public static interface EmailStep {
		PhoneStep withEmail(final String email);
	}

	public static interface LastNameStep {
		EmailStep withLastName(final String lastName);
	}

	public static interface FirstNameStep {
		LastNameStep withFirstName(final String firstName);
	}

	public static FirstNameStep newBuilder() {
		return new Steps();
	}

	private static class Steps implements FirstNameStep, LastNameStep, EmailStep, PhoneStep, BuildStep {
		private String email;
		private String firstName;
		private String lastname;
		private String phone;

		@Override
		public ShopifyCustomerCreateRequest build() {
			return new ShopifyCustomerCreateRequest(this);
		}

		@Override
		public BuildStep withPhone(final String phone) {
			this.phone = phone;
			return this;
		}

		@Override
		public PhoneStep withEmail(final String email) {
			this.email = email;
			return this;
		}

		@Override
		public EmailStep withLastName(final String lastName) {
			this.lastname = lastName;
			return this;
		}

		@Override
		public LastNameStep withFirstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

}
