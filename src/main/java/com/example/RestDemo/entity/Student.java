package com.example.RestDemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement (name = "student")
@XmlAccessorType(XmlAccessType.FIELD	)
@XmlType(name="",propOrder={"dg","sub","details"})
	
public class Student {
	public void setDetails(List<JAXBElement<String>> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Student [dg=" + dg + ", sub=" + sub + ", details=" + details + "]";
	}
	@XmlElement
	private StudentDemographicsDetails dg;
	@XmlElement
	private Subject sub;
	@XmlAnyElement
	//@XmlElement
	private List<JAXBElement<String>> details;
	public StudentDemographicsDetails getDg() {
		return dg;
	}
	public void setDg(StudentDemographicsDetails dg) {
		this.dg = dg;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public List<JAXBElement<String>> getDetails() {
		if(details==null){
			details=new ArrayList<>();
			}
		return details;
	}
	
	

}
