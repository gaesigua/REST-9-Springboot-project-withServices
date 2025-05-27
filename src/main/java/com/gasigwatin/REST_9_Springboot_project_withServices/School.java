package com.gasigwatin.REST_9_Springboot_project_withServices;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "School Table")
public class School{

        @Id
        @GeneratedValue
        private Integer id;

        @Column(name = "School Name", length = 255)
        private String schoolName;

        @OneToMany(mappedBy = "school")
        @JsonManagedReference
        private List<Student> student;


//    Creating an empty CONSTRUCTOR (REQUIRED)

        public School(){}

//    Creating one CONSTRUCTOR with parameters

        public School(String schoolName){
            this.schoolName = schoolName;
        }

//    Setter and Getter for Id

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        //    Setter and Getter for schoolName


        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public String getSchoolName() {
            return schoolName;
        }

//    Setter and Getter for List<Student>

        public List<Student> getStudent() {
            return student;
        }

        public void setStudent(List<Student> student) {
            this.student = student;
        }

    }
