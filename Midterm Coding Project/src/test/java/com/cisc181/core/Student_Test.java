package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.text.DecimalFormat;  
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		UUID CourseID1 = UUID.randomUUID();
		UUID CourseID2 = UUID.randomUUID();
		UUID CourseID3 = UUID.randomUUID();
		UUID SemesterFall = UUID.randomUUID();
		UUID SemesterSpring = UUID.randomUUID();
		UUID SectionID1 = UUID.randomUUID();
		UUID SectionID2 = UUID.randomUUID();
		UUID SectionID3 = UUID.randomUUID();
		UUID SectionID4 = UUID.randomUUID();
		UUID SectionID5 = UUID.randomUUID();
		UUID SectionID6 = UUID.randomUUID();
		UUID SectionID7 = UUID.randomUUID();
		UUID SectionID8 = UUID.randomUUID();
		UUID SectionID9 = UUID.randomUUID();
		UUID SectionID10 = UUID.randomUUID();
		UUID SectionID11 = UUID.randomUUID();
		UUID SectionID12 = UUID.randomUUID();
		
		Date fallstart = new Date("09/01/2018");
		Date fallend = new Date("12/25/2018");
		Date Springstart = new Date("03/01/2019");
		Date Springend = new Date("06/01/2019");
		Date Student1 = new Date("08/23/2018");
		Date Student2 = new Date("09/23/2018");
		Date Student3 = new Date("10/23/2018");
		Date Student4 = new Date("11/23/2018");
		Date Student5 = new Date("12/23/2018");
		Date Student6 = new Date("01/23/2018");
		Date Student7 = new Date("02/23/2018");
		Date Student8 = new Date("03/23/2018");
		Date Student9 = new Date("04/23/2018");
		Date Student10 = new Date("05/23/2018");
		
		
		
		ArrayList<Student> Student = new ArrayList<Student>();
		ArrayList<Course> Course = new ArrayList<Course>();
		ArrayList<Semester> Semester = new ArrayList<Semester>();
		ArrayList<Section> Section = new ArrayList<Section>();
		
		Course.add(new Course(CourseID1, "cisc",99));
		Course.add(new Course(CourseID2, "cisc",90));
		Course.add(new Course(CourseID3, "cisc",80));
		
		Semester.add(0, new Semester(SemesterFall,fallstart,fallend));//0 stands for fall
		Semester.add(1, new Semester(SemesterSpring,Springstart,Springend));//1 stands for Spring
		Section.add(0, new Section(CourseID1,SemesterFall,SectionID1,100));
		Section.add(1, new Section(CourseID1,SemesterFall,SectionID2,101));
		Section.add(2, new Section(CourseID1,SemesterSpring,SectionID3,110));
		Section.add(3, new Section(CourseID1,SemesterSpring,SectionID4,121));
		
		Section.add(4, new Section(CourseID2,SemesterFall,SectionID5,102));
		Section.add(5, new Section(CourseID2,SemesterFall,SectionID6,103));
		Section.add(6, new Section(CourseID2,SemesterSpring,SectionID7,112));
		Section.add(7, new Section(CourseID2,SemesterSpring,SectionID8,123));
		
		Section.add(8, new Section(CourseID3,SemesterFall,SectionID9,114));
		Section.add(9, new Section(CourseID3,SemesterFall,SectionID10,125));
		Section.add(10, new Section(CourseID3,SemesterSpring,SectionID11,134));
		Section.add(11, new Section(CourseID3,SemesterSpring,SectionID12,145));
		
		/*Student.add(0,new Student("harry","","shu",Student1,eMajor.BUSINESS,"435 academic st","302-345-2454","sdfsgdf@udel.edu"));
		Student.add(1,new Student("tom","","shu",Student2,eMajor.NURSING,"345 academic st","302-325-2447","sdggs@udel.edu"));
		Student.add(2,new Student("tim","","shu",Student3,eMajor.PHYSICS,"346 academic st","302-326-5856","whreg@udel.edu"));
		Student.add(3,new Student("billy","","shu",Student4,eMajor.BUSINESS,"754 academic st","302-346-6435","sdhffsgdf@udel.edu"));
		Student.add(5,new Student("pane","","shu",Student5,eMajor.BUSINESS,"678 academic st","302-346-7355","berge@udel.edu"));
		Student.add(6,new Student("lovely","","shu",Student6,eMajor.BUSINESS,"2675 academic st","302-367-5676","dfhth@udel.edu"));
		Student.add(7,new Student("handsome","","shu",Student7,eMajor.PHYSICS,"4646 academic st","302-166-5475","yhfgd@udel.edu"));
		Student.add(8,new Student("bueatiful","","shu",Student8,eMajor.CHEM,"4345 academic st","302-263-7363","xzdtdht@udel.edu"));
		Student.add(9,new Student("happy","","shu",Student9,eMajor.COMPSI,"2634 academic st","302-267-5675","sdryr@udel.edu"));
		Student.add(10,new Student("chen","","shu",Student10,eMajor.BUSINESS,"1536 academic st","302-346-7344","rhttyh@udel.edu"));
		*/
		
	}

	@Test
	public void test() {
		ArrayList<Student> Student = new ArrayList<Student>();
		Date Student1 = new Date("08/23/2018");
		Date Student2 = new Date("09/23/2018");
		Date Student3 = new Date("10/23/2018");
		Date Student4 = new Date("11/23/2018");
		Date Student5 = new Date("12/23/2018");
		Date Student6 = new Date("01/23/2018");
		Date Student7 = new Date("02/23/2018");
		Date Student8 = new Date("03/23/2018");
		Date Student9 = new Date("04/23/2018");
		Date Student10 = new Date("05/23/2018");
		UUID SectionID1 = UUID.randomUUID();
		UUID SectionID2 = UUID.randomUUID();
		UUID SectionID3 = UUID.randomUUID();
		UUID SectionID4 = UUID.randomUUID();
		UUID SectionID5 = UUID.randomUUID();
		UUID SectionID6 = UUID.randomUUID();
		UUID SectionID7 = UUID.randomUUID();
		UUID SectionID8 = UUID.randomUUID();
		UUID SectionID9 = UUID.randomUUID();
		UUID SectionID10 = UUID.randomUUID();
		UUID SectionID11 = UUID.randomUUID();
		UUID SectionID12 = UUID.randomUUID();
		
		UUID EnrollmentID1 = UUID.randomUUID();
		UUID EnrollmentID2 = UUID.randomUUID();
		UUID EnrollmentID3 = UUID.randomUUID();
		UUID EnrollmentID4 = UUID.randomUUID();
		UUID EnrollmentID5 = UUID.randomUUID();
		UUID EnrollmentID6 = UUID.randomUUID();
		UUID EnrollmentID7 = UUID.randomUUID();
		UUID EnrollmentID8 = UUID.randomUUID();
		UUID EnrollmentID9 = UUID.randomUUID();
		UUID EnrollmentID10 = UUID.randomUUID();
		
		UUID CourseID1 = UUID.randomUUID();
		UUID CourseID2 = UUID.randomUUID();
		UUID CourseID3 = UUID.randomUUID();
		UUID SemesterFall = UUID.randomUUID();
		UUID SemesterSpring = UUID.randomUUID();
		
		Date fallstart = new Date("09/01/2018");
		Date fallend = new Date("12/25/2018");
		Date Springstart = new Date("03/01/2019");
		Date Springend = new Date("06/01/2019");
		
		ArrayList<Course> Course = new ArrayList<Course>();
		ArrayList<Semester> Semester = new ArrayList<Semester>();
		ArrayList<Section> Section = new ArrayList<Section>();
		
		Course.add(new Course(CourseID1, "cisc",99));
		Course.add(new Course(CourseID2, "cisc",90));
		Course.add(new Course(CourseID3, "cisc",80));
		
		Semester.add(0, new Semester(SemesterFall,fallstart,fallend));//0 stands for fall
		Semester.add(1, new Semester(SemesterSpring,Springstart,Springend));//1 stands for Spring
		
		Student.add(0,new Student("harry","","shu",Student1,eMajor.BUSINESS,"435 academic st","302-345-2454","sdfsgdf@udel.edu"));
		Student.add(1,new Student("tom","","shu",Student2,eMajor.NURSING,"345 academic st","302-325-2447","sdggs@udel.edu"));
		Student.add(2,new Student("tim","","shu",Student3,eMajor.PHYSICS,"346 academic st","302-326-5856","whreg@udel.edu"));
		Student.add(3,new Student("billy","","shu",Student4,eMajor.BUSINESS,"754 academic st","302-346-6435","sdhffsgdf@udel.edu"));
		Student.add(4,new Student("billy","","shu",Student5,eMajor.BUSINESS,"346 academic st","302-636-4566","16325@udel.edu"));
		Student.add(5,new Student("pane","","shu",Student5,eMajor.BUSINESS,"678 academic st","302-346-7355","berge@udel.edu"));
		Student.add(6,new Student("lovely","","shu",Student6,eMajor.BUSINESS,"2675 academic st","302-367-5676","dfhth@udel.edu"));
		Student.add(7,new Student("handsome","","shu",Student7,eMajor.PHYSICS,"4646 academic st","302-166-5475","yhfgd@udel.edu"));
		Student.add(8,new Student("bueatiful","","shu",Student8,eMajor.CHEM,"4345 academic st","302-263-7363","xzdtdht@udel.edu"));
		Student.add(9,new Student("happy","","shu",Student9,eMajor.COMPSI,"2634 academic st","302-267-5675","sdryr@udel.edu"));
		ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
		enrollment.add(0,new Enrollment(SectionID1,Student.get(0).getStudentID(),89.0));
		enrollment.add(1,new Enrollment(SectionID1,Student.get(1).getStudentID(),78.0));
		enrollment.add(2,new Enrollment(SectionID2,Student.get(2).getStudentID(),90.0));
		enrollment.add(3,new Enrollment(SectionID2,Student.get(3).getStudentID(),96.0));
		enrollment.add(4,new Enrollment(SectionID2,Student.get(4).getStudentID(),98.0));
		enrollment.add(5,new Enrollment(SectionID4,Student.get(5).getStudentID(),90.0));
		enrollment.add(6,new Enrollment(SectionID4,Student.get(6).getStudentID(),86.0));
		enrollment.add(7,new Enrollment(SectionID5,Student.get(7).getStudentID(),85.0));
		enrollment.add(8,new Enrollment(SectionID5,Student.get(8).getStudentID(),84.0));
		enrollment.add(9,new Enrollment(SectionID6,Student.get(9).getStudentID(),99.0));
		double sum1=0.0;
		double sum2=0.0;
		double sum4=0.0;
		double sum5=0.0;
		double sum6=0.0;
		double gpa1 = 0.0;
		double gpa2 = 0.0;
		double gpa3 = 0.0;
		double gpa4 = 0.0;
		double gpa5 = 0.0;
		double gpa6 = 0.0;
		double gpa7 = 0.0;
		double gpa8 = 0.0;
		double gpa9 = 0.0;
		double gpa10 = 0.0;
		double gpa11 =0.0;
		double[] gpa = {gpa1,gpa2,gpa3,gpa4,gpa5,gpa6,gpa7,gpa8,gpa9,gpa10,gpa11};
		
		
		for(int i =0 ; i<10; i++) {
			if(enrollment.get(i).getGrade() >= 93.0) {
				gpa[i] = 4.0;
			}else if(enrollment.get(i).getGrade() >= 83.0 && enrollment.get(i).getGrade() < 93.0){
				gpa[i] = 3.0;
			}else if(enrollment.get(i).getGrade() >= 73.0 && enrollment.get(i).getGrade() < 83.0) {
				gpa[i] = 2.0;
			}else {gpa[i] = 0.0;}
		}
		
		for (Enrollment CourseAVG : enrollment) {
			if(CourseAVG.getSectionID() == SectionID1) {
				sum1 += CourseAVG.getGrade();
			}
		}
		for (Enrollment CourseAVG : enrollment) {
			if(CourseAVG.getSectionID() == SectionID2) {
				sum2 += CourseAVG.getGrade();
			}
		}
		for (Enrollment CourseAVG : enrollment) {
			if(CourseAVG.getSectionID() == SectionID4) {
				sum4 += CourseAVG.getGrade();
			}
		}
		for (Enrollment CourseAVG : enrollment) {
			if(CourseAVG.getSectionID() == SectionID5) {
				sum5 += CourseAVG.getGrade();
			}
		}
		for (Enrollment CourseAVG : enrollment) {
			if(CourseAVG.getSectionID() == SectionID6) {
				sum6 += CourseAVG.getGrade();
			}
		}
		
		DecimalFormat df = new DecimalFormat("######0.0"); 
		sum1 = sum1/2;
		sum2 = sum2/3;
		String strsum2 = df.format(sum2);
	    sum2 = Double.valueOf(strsum2).doubleValue();
		sum4 = sum4/2;
		sum5 = sum5/2;
		
		
		assertEquals(gpa[0],3.0,0.01);
		assertEquals(gpa[1],2.0,0.01);
		assertEquals(gpa[2],3.0,0.01);
		assertEquals(gpa[3],4.0,0.01);
		assertEquals(gpa[4],4.0,0.01);
		assertEquals(gpa[5],3.0,0.01);
		assertEquals(gpa[6],3.0,0.01);
		assertEquals(gpa[7],3.0,0.01);
		assertEquals(gpa[8],3.0,0.01);
		assertEquals(gpa[9],4.0,0.01);
		
		
		
		assertEquals(sum1, 83.5,0.01);
		assertEquals(sum2, 94.7,0.01);
		assertEquals(sum4, 88.0,0.01);
		assertEquals(sum5, 84.5,0.01);
		assertEquals(sum6, 99.0,0.01);
	}
}















