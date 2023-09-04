package com.student_information.payload;

import com.student_information.entity.Education;
import com.student_information.entity.Information;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDto {
    private long id;
    private String name;
    private String classes;
    private int roll;
    private Information info;
    private Education edu;
}
