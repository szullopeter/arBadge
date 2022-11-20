package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	private List<StudentEntity> students = new ArrayList<StudentEntity>();

	private void init() {
		students.add(new StudentEntity(1, "Nev", "BME", 2, 3, "diploma", "szoftver", "231541235"));
	}
	
	
	// Osszes hallgatot visszaadja
	@CrossOrigin
	@RequestMapping(value = "/student/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<StudentEntity>> getAllStudents(){
		if(students.size() == 0)
			init();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	
	// Elment egy hallgatot
	@CrossOrigin
	@RequestMapping(value = "/student/save", method = RequestMethod.POST,consumes = "application/json")
	public String saveStudent(@RequestBody StudentEntity student) {
		students.add(student);
		return "Sikeres mentes!";
	 }
	
	// Keresett ID-vel rendelkezo hallgatot adja vissza
	@CrossOrigin
	@RequestMapping(value = "/student/getStudent/{id}", method = RequestMethod.GET)
	public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") int id){
		for(int i = 0; i<students.size();i++)
			if(students.get(i).getID() == id)
				return new ResponseEntity<>(students.get(i),HttpStatus.OK);
		
		return null;
	}		
	
	
}
