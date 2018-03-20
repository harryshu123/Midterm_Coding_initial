package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.*;

public class Course extends Semester{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	public Course() {
		
	}
	
	public Course(UUID courseID, String courseName, int gradePoints) {
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
	}

	public Course(UUID semesterID, Date startDate, Date endDate, UUID courseID, String courseName, int gradePoints,
			com.cisc181.eNums.eMajor eMajor) {
		super(semesterID, startDate, endDate);
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		this.eMajor = eMajor;
	}
	
	
	
}
