package com.example.demo;

public class StudentEntity {
	private int ID;
	private String Name;
	private String University;
	private int Teachers_ID;
	private int Theme_ID;
	private String Progress;
	private String Specialization;
	private String Contact;
	
	
	public StudentEntity(int iD, String name, String university, int teachers_ID, int theme_ID, String progress,
			String specialization, String contact) {
		ID = iD;
		Name = name;
		University = university;
		Teachers_ID = teachers_ID;
		Theme_ID = theme_ID;
		Progress = progress;
		Specialization = specialization;
		Contact = contact;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String university) {
		University = university;
	}
	public int getTeachers_ID() {
		return Teachers_ID;
	}
	public void setTeachers_ID(int teachers_ID) {
		Teachers_ID = teachers_ID;
	}
	public int getTheme_ID() {
		return Theme_ID;
	}
	public void setTheme_ID(int theme_ID) {
		Theme_ID = theme_ID;
	}
	public String getProgress() {
		return Progress;
	}
	public void setProgress(String progress) {
		Progress = progress;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	
	
}
