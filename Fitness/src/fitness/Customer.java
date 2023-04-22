package fitness;

import java.util.*;

public class Customer {
	String idNo;
	  String name;
	  String phoneNo;
	  String address;
	  List<Lesson> lessons = new ArrayList<>();


	public Customer(String idNo, String name, String phoneNo, String address) {
		this.idNo = idNo;
	    this.name = name;
	    this.phoneNo = phoneNo;
	    this.address = address;
	}

	public String getIdNo() {
		return idNo;
	}



	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}


	public void addLesson(Lesson lesson) {
	    this.lessons.add(lesson);
	    }
	
	public void removeLesson(Lesson lesson) {
	    this.lessons.remove(lesson);
	  }
	
	public List<Lesson> getLessons() {
	    return lessons;
	  }

}
