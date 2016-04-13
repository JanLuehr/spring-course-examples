package net.gfu.seminar.spring.helloworld.web;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AddGuestForm implements Serializable {

	private static final long serialVersionUID = -149744409282179291L;

	@Pattern(regexp="^[A-Z][a-z]+", message="Ungueltiger Name")
	private String firstname;

	@Size(min = 1, max = 50)
	private String lastname;
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	@Override
	public String toString() {
		return "AddGuestForm [firstname=" + firstname + ", lastname="
				+ lastname + "]";
	}
	
}
