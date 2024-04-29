package com.TestJacocoplugin.repo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class TestRepo {

	
		public int id;
		public String name;

		public TestRepo(int i, String string) {
			// TODO Auto-generated constructor stub
		}
	}
