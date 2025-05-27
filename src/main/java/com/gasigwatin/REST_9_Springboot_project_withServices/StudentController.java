package com.gasigwatin.REST_9_Springboot_project_withServices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){

        this.studentService = studentService;

    }

    //LET'S CREATE (ENTER) NEW STUDENTS

    @PostMapping("/students")
    public StudentResponseDto saveStudent(
            @RequestBody StudentDto studentDto){

        return this.studentService.saveStudent(studentDto);
    }


    //LET'S RETRIEVE ALL STUDENTS

    @GetMapping("/students")
    public List<StudentResponseDto> retrieveAllStudents(){

        return this.studentService.retrieveAllStudents();
    }

    //LET'S RETRIEVE ONE STUDENT, USING THEIR ID

    @GetMapping("/students/{student-id}")
    public StudentResponseDto retrieveOneStudentById(
            @PathVariable("student-id") Integer studentId){

        return this.studentService.retrieveOneStudentById(studentId);
    }

    //LET'S RETRIEVE A STUDENT (IT COULD BE MORE THAN ONE STUDENT) USING THEIR FIRST NAME


    @GetMapping("/students/search/{student-firstname}")
    public List<StudentResponseDto> retrieveOneStudentByFirstName(
            @PathVariable("student-firstname") String studentFirstName){

        return this.studentService.retrieveOneStudentByFirstName(studentFirstName);
    }

    //LET'S DELETE ONE STUDENT

    @DeleteMapping("/student/search/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteOneStudent (@PathVariable ("student-id") Integer studentId){

        this.studentService.deleteOneStudent(studentId);
    }
}