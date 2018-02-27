package com.example.tutorial3.service;

import java.util.List;

import com.example.tutorial3.model.StudentModel;

import java.util.ArrayList;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		//implement
		if(npm != null) {
			for(int i=0; i<studentList.size(); i++) {
				if((studentList.get(i).getNpm()).equalsIgnoreCase(npm)) {
					return studentList.get(i);
				}
			}
			return null;
		}
		else
			return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudents(){
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
}
