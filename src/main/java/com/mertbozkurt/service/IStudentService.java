package com.mertbozkurt.service;

import java.util.List;

import com.mertbozkurt.dto.DtoStudent;
import com.mertbozkurt.dto.DtoStudentIU;
import com.mertbozkurt.entities.Student;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getStudent();
	
	public DtoStudent getStudentById(Integer id);
	
	public DtoStudent getSutdentByIdWithCourse(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
	
}
