package com.student_information.service;

import com.student_information.payload.StudentDto;

public interface StudentService {
    StudentDto getStudentById(long id);
}
