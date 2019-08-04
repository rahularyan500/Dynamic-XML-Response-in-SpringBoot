package com.example.RestDemo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name = "DG")
@XmlAccessorType(XmlAccessType.FIELD	)
public class StudentDemographicsDetails {
	private String name;
	@Override
	public String toString() {
		return "StudentDemographicsDetails [name=" + name + ", age=" + age + ", sclass=" + sclass + ", school=" + school
				+ "]";
	}
	@XmlElement
	private String age;
	@XmlElement
	private String sclass;
	@XmlElement
	private String school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	

}
