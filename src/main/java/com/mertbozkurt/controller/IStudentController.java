package com.mertbozkurt.controller;

import java.util.List;

import com.mertbozkurt.dto.DtoStudent;
import com.mertbozkurt.dto.DtoStudentIU;
import com.mertbozkurt.entities.Student;

public interface IStudentController {

	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public DtoStudent getStudentByIdWithCourse(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
