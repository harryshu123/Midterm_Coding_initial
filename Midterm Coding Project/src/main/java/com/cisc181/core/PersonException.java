package com.cisc181.core;



import java.util.regex.Pattern;

import ch.qos.logback.core.boolex.Matcher;

public class PersonException extends Exception {
	private Person person1;
	public PersonException() throws Exception {
		if(this.person1.getDOB().getYear() > 100) {
			throw new Exception("the person is too older");
		}
		
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		 
		Pattern pattern = Pattern.compile(regex);
		 java.util.regex.Matcher matcher = pattern.matcher(this.person1.getPhone());
		
		if(matcher.matches() == false) {
			throw new Exception("the format of the phonenumber is wrong");
		}
	}
	public PersonException(Staff a) throws Exception {
		if(a.getDOB().getYear() > 100) {
			throw new Exception("the person is too older");
		}
		
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		 
		Pattern pattern = Pattern.compile(regex);
		 java.util.regex.Matcher matcher = pattern.matcher(a.getPhone());
		
		if(matcher.matches() == false) {
			throw new Exception("the format of the phonenumber is wrong");
		}
	}
}
