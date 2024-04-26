package com.TestJacocoplugin.personModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Person {

	
	public int id;
	public String name;

	public Person(int i, String string) {
		// TODO Auto-generated constructor stub
	}
}
