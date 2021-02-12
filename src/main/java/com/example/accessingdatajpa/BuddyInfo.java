package com.example.accessingdatajpa;

import javax.persistence.*;

@Entity
public class BuddyInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long phoneNumber;
	private String name;
	private int age;

	public BuddyInfo(String name, long phoneNumber, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public BuddyInfo(long id, String name, long phoneNumber, int age) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public BuddyInfo(BuddyInfo b) {
		this.name = b.getName();
		this.phoneNumber = b.getPhoneNumber();
		this.age = b.getAge();
	}

	protected BuddyInfo() { }

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the id of this Player. The persistence provider should
	 * autogenerate a unique id for new player objects.
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void print() {
		System.out.println("Hello, my name is " + this.name + ", and my phone number is " + this.phoneNumber);
	}

	@Override
	public String toString() {
		return "BuddyInfo[ID: " + id + ", Name: " + name + ", PhoneNumber: " + phoneNumber + ", Age: " + age + "]";
	}

	public String greeting() {
		return "Hello, my name is " + this.name + ", and my phone number is " + this.phoneNumber;
	}
	
	public String toXML() {
		String r = "<BuddyInfo>";
		r += "<name>" + this.name + "</name>";
		r += "<phoneNumber>" + this.phoneNumber + "</phoneNumber>";
		r += "<age>" + this.age + "</age>";
		r += "</BuddyInfo>";
		return r;
	}
}
