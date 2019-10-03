package com.raman.webservice.restweb.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.raman.webservice.restweb.bean.Person;
import org.springframework.stereotype.Component;

import com.raman.webservice.restweb.bean.Person;

@Component
public class PersonService {
	
	private static List<Person> persons= new ArrayList<>();
	private static long counter=0;
	
	static {
		persons.add(new Person(++counter, "Raman", "Singh", 36));
		persons.add(new Person(++counter, "Silky", "Saigal", 34));
		persons.add(new Person(++counter, "Yuvraj", "Singh", 33));
		persons.add(new Person(++counter, "Sangeeta", "Singh", 59));
		persons.add(new Person(++counter, "Devendra", "Pal Singh",66));

	}

	
	public List<Person> findAll(){
		return persons;
	}






	public Person findBy(String name) {
		for(Person t: persons) {
			if(t.getFirstName().equalsIgnoreCase(name.toLowerCase()) || t.getLastName().toLowerCase().equalsIgnoreCase(name)) {
				return t;
			}
			
		}
		return null;
	}
}
