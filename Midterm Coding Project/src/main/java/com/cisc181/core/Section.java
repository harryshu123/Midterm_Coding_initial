package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section extends Course{
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	public Section() {
		
	}
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		super();
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}

	public Section(UUID semesterID, Date startDate, Date endDate, UUID courseID, String courseName, int gradePoints,
			com.cisc181.eNums.eMajor eMajor, UUID courseID2, UUID semesterID2, UUID sectionID, int roomID) {
		super(semesterID, startDate, endDate, courseID, courseName, gradePoints, eMajor);
		CourseID = courseID2;
		SemesterID = semesterID2;
		SectionID = sectionID;
		RoomID = roomID;
	}
	
	
}
