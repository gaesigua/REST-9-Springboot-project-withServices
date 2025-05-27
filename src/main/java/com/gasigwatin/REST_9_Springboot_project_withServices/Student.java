package com.gasigwatin.REST_9_Springboot_project_withServices;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "Student Table")
public class Student {

        @Id
        @GeneratedValue
        private Integer id;

        @Column(name = "First Name",length = 25)
        private String firstName;

        @Column(name = "Last Name", length = 25)
        private String lastName;

        @Column(name = "Email", length = 50)
        private String email;

        @Column(name = "Age", length = 2)
        private int age;

        @Column(name = "Creation Date", updatable = false)
        private String creationDate;

        @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
        private StudentProfile studentProfile;

        @ManyToOne
        @JoinColumn(name = "school_id")
        @JsonBackReference
        private School school;


        //    An Empty Constructor (REQUIRED)
        public Student(){}

//    A Class Constructor

        public Student(String firstName, String lastName, String email, int age, String creationDate, StudentProfile studentProfile, School school){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.age = age;
            this.creationDate = creationDate;
            this.studentProfile = studentProfile;
            this.school = school;
        }

//    Setter and Getter for Id


        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

//    Setter and Getter for firstName


        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

//    Setter and Getter for lastName


        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

//    Setter and Getter for email


        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

//    Setter and Getter for age


        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

//    Setter and Getter for creationDate


        public void setCreationDate(String creationDate) {
            this.creationDate = creationDate;
        }

        public String getCreationDate() {
            return creationDate;
        }

//    Setter and Getter for studentProfile


        public void setStudentProfile(StudentProfile studentProfile) {
            this.studentProfile = studentProfile;
        }

        public StudentProfile getStudentProfile() {
            return studentProfile;
        }

//    Setter and Getter for School


        public void setSchool(School school) {
            this.school = school;
        }

        public School getSchool() {
            return school;
        }

    }


}
