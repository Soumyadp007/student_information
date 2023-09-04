package com.student_information.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name= "stu_details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "stu_id")
    private long id;
    private String name;
    private String classes;
    private int roll;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "info_id")
    private Information info;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "edu_id")
    private Education edu;
}
