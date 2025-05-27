package com.gasigwatin.REST_9_Springboot_project_withServices;

import jakarta.persistence.*;

@Entity
@Table(name = "Student Profile")
public class StudentProfile{

        @Id
        @GeneratedValue
        private Integer id;

        private String bio;

        @OneToOne
        @JoinColumn(name = "student_id")
        private Student student;


//    An Empty Constructor(REQUIRED)

        public StudentProfile(){}

//    A Class Constructor

        public StudentProfile(String bio, Student student){
            this.bio = bio;
            this.student = student;
        }

//    Setter and Getter for Id


        public void setId(Integer id) {
            this.id = id;
        }

        public String getId(){
            return bio;
        }

//    Setter and Getter for bio


        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getBio() {
            return bio;
        }

//    Setter and Getter for student

        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

    }
