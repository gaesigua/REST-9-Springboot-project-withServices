package com.gasigwatin.REST_9_Springboot_project_withServices.student;

import com.gasigwatin.REST_9_Springboot_project_withServices.school.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    //LET'S CREATE A METHOD THAT WILL ALLOW US TO ENTER ENTRIES, WITHOUT NEEDING TO USE ALL THE FIELDS.

    public Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        student.setAge(dto.age());

        var school = new School();
        school.setId(dto.schoolId());

        //Now we need to set the object of type schoolId (the last parameter in the StudentDto record), and then link it to the student object

        student.setSchool(school);

        return student;
    }

    // LET'S CREATE A REPRESENTATION THAT WE CAN EXPOSE TO THE REST Client WITH JUST The First name and Last name of the Student

    public StudentResponseDto toStudentResponseDto(Student student){

        return new StudentResponseDto(student.getFirstName(), student.getLastName());
    }
}