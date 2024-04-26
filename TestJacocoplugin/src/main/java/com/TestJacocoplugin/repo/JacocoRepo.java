package com.TestJacocoplugin.repo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.TestJacocoplugin.personModel.Person;
import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class JacocoRepo {

	public List<Person> repoDetails() {
		List<Person> lst= new ArrayList<Person>();
		Person p1=	new Person(1,"vvv");
		Person p3=	new Person(3,"ccc");
		Person p2=	new Person(2,"nnn");
		Person p4=	new Person(4,"bbb");
		Person p5=	new Person(5,"aaa");
		
		List<Person> PersonList = Arrays.asList(p1,p2,p3,p4,p5);
		List<Person> sortedPersonList = PersonList.stream().sorted()
				.collect(Collectors.toList());
		return sortedPersonList;
	}
}
