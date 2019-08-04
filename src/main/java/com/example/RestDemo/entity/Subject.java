package com.example.RestDemo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name = "Sub")
@XmlAccessorType(XmlAccessType.FIELD	)
public class Subject {
	@Override
	public String toString() {
		return "Subject [subname=" + subname + ", marks=" + marks + "]";
	}
	@XmlElement
	private String subname;
	@XmlElement
	private String marks;
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
}
