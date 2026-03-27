package com.mertbozkurt.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mertbozkurt.dto.DtoCourse;
import com.mertbozkurt.dto.DtoStudent;
import com.mertbozkurt.dto.DtoStudentIU;
import com.mertbozkurt.entities.Course;
import com.mertbozkurt.entities.Student;
import com.mertbozkurt.repository.StudentRepository;
import com.mertbozkurt.service.IStudentService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		DtoStudent response = new DtoStudent();
		Student student = new Student();
	    BeanUtils.copyProperties(dtoStudentIU, student);
	    
		Student dbStudent = studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		return response;
	    
	}

	@Override
	public List<DtoStudent> getStudent() {
		List<DtoStudent> dtolist = new ArrayList<>();
		List<Student> studentList = studentRepository.findAll();
		for (Student student : studentList) {
			DtoStudent dto = new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtolist.add(dto);
		}
		return dtolist;
	}


	@Override
	public DtoStudent getStudentById(Integer id) {
		DtoStudent dto = new DtoStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent()) {
			Student dbStudent = optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
				
		}
		return dto;
	}
		

	@Override
	public void deleteStudent(Integer id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional != null) {
		studentRepository.delete(optional.get());
		}
		
		
		
	}

	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DtoStudent dto = new DtoStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if(optional != null) {
			Student dbStudent = optional.get();
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
			
			Student updatedStudent = studentRepository.save(dbStudent);
			
			BeanUtils.copyProperties(updatedStudent, dto);
			return dto;
		}
		
		return null;
     }

	@Override
	public DtoStudent getSutdentByIdWithCourse(Integer id) {
		DtoStudent dto = new DtoStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent()) {
			Student dbStudent = optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
			
		if (dbStudent.getCourses()!=null && !dbStudent.getCourses().isEmpty()) {
			for (Course course : dbStudent.getCourses()) {
				DtoCourse dtoCourse = new DtoCourse();
				BeanUtils.copyProperties(course, dtoCourse);
				
				dto.getCourses().add(dtoCourse);
				
			}
		}	
		return dto;
		}
		return dto;
	}
	

}
