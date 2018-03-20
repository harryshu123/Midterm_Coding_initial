package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Enrollment extends Section{
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	
	
	public Enrollment(UUID sectionID, UUID studentID, double grade) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		this.Grade = grade;
		this.EnrollmentID = UUID.randomUUID();
	}



	public Enrollment(UUID semesterID, Date startDate, Date endDate, UUID courseID, String courseName, int gradePoints,
			com.cisc181.eNums.eMajor eMajor, UUID courseID2, UUID semesterID2, UUID sectionID, int roomID,
			UUID sectionID2, UUID studentID, UUID enrollmentID, double grade) {
		super(semesterID, startDate, endDate, courseID, courseName, gradePoints, eMajor, courseID2, semesterID2,
				sectionID, roomID);
		SectionID = sectionID2;
		StudentID = studentID;
		EnrollmentID = enrollmentID;
		Grade = grade;
	}



	public UUID getSectionID() {
		return SectionID;
	}



	public double getGrade() {
		return Grade;
	}



	public void setGrade(double grade) {
		Grade = grade;
	}
	
	
}
