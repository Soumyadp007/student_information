package com.student_information.service.serviceImpl;

import com.student_information.entity.Student;
import com.student_information.payload.StudentDto;
import com.student_information.repository.StudentRepo;
import com.student_information.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public StudentDto getStudentById(long id) {
        Student student = studentRepo.findById(id).get();
        return mapToDto(student);
    }
    StudentDto mapToDto(Student student){
        return modelMapper.map(student, StudentDto.class);
    }
}
