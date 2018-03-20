package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
		
		
		}
	
	@Test
	public void test() {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(new Staff(eTitle.MR));
		staff.add(new Staff(eTitle.MS));
		staff.add(new Staff(eTitle.MRS));
		staff.add(new Staff(eTitle.MR));
		staff.add(new Staff(eTitle.MRS));
		staff.get(0).setSalary(2500.0);
		staff.get(1).setSalary(2500.0);
		staff.get(2).setSalary(2600.0);
		staff.get(3).setSalary(2800.0);
		staff.get(4).setSalary(3000.0);
		double sum = 0;
		for(Staff onestaff : staff) {
			sum += onestaff.getSalary();
		}
		
		double AverageSalaries = sum/5;
		assertEquals(AverageSalaries,2680.0,0.01);
		assertEquals(1,1);
	}	
	@Test
	public void test2() throws ParseException,PersonException{
		String pattern = "MM/dd/yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
		
		Date date1 = new Date("12/14/2018");
		
		Date date2 = new Date("08/25/2018");
		//String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		 
		//Pattern patterne = Pattern.compile(regex);
		
		
		//Matcher matcher = patterne.matcher(staffa.getPhone());
		//boolean rightPhoneNumber = matcher.matches();
		
		try {
			Staff a = new Staff("Harry","","Shu",date1,"352 Academic st",
					"3026904289","harryshu@udel.edu","Mon 1-2", 1, 3000.0,date2,eTitle.MR);
			
			Date date3 = format.parse("12-14-1997");
		    Date date4 = format.parse("08-25-2018");
		   
		}catch (ParseException pee) {
			System.out.print("the DOB format is wrong");
			throw new ParseException("the DOB format is wrong", 0);
		}
	}
	
	

}
