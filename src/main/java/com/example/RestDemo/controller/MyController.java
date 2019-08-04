package com.example.RestDemo.controller;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestDemo.entity.Student;
import com.example.RestDemo.entity.StudentDemographicsDetails;
import com.example.RestDemo.entity.Subject;

@RestController
public class MyController {

	@GetMapping(value="/healthCheck")
	public String helthCheck()
	{
		return "OK";
	}
	 @PostMapping(value="/customer",produces="application/xml")
	   public Student getCustomer(){
		 Student s=new Student();
		 StudentDemographicsDetails sd=new StudentDemographicsDetails();
		 Subject sub=new Subject();
		 
		 sd.setName("Rahul Aryan");
		 sd.setAge("27");
		 sd.setSchool("SHHS");
		 sd.setSclass("IAS");
		 sub.setMarks("95");
		 sub.setSubname("math");
		 s.setDg(sd);
		 s.setSub(sub);
		// List<JAXBElement<String>> elem= s.getDetails();
		 JAXBElement<String> aaa=new JAXBElement<>(new QName("rrr"),String.class,"pandey");
		 JAXBElement<String> bbb=new JAXBElement<>(new QName("skkk"),String.class,"pssp");
		 s.getDetails().add(aaa);
		 s.getDetails().add(bbb);
		 System.out.println(s);
	     return s;
	   }
}
