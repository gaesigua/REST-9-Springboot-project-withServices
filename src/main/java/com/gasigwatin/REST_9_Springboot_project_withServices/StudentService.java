package com.gasigwatin.REST_9_Springboot_project_withServices;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentMapper studentMapper;

    private final StudentRepository studentRepository;

    public StudentService(StudentMapper studentMapper, StudentRepository studentRepository) {
        this.studentMapper = studentMapper;
        this.studentRepository = studentRepository;
    }

    public StudentResponseDto saveStudent(StudentDto studentDto){

        var student = studentMapper.toStudent(studentDto);
        var savedStudent = studentRepository.save(student);

        return studentMapper.toStudentResponseDto(savedStudent);
    }

    public List<StudentResponseDto> retrieveAllStudents(){
        return studentRepository.findAll().stream().map(studentMapper::toStudentResponseDto).collect(Collectors.toList());
    }

    public StudentResponseDto retrieveOneStudentById(Integer studentId){

        return studentRepository.findById(studentId).map(studentMapper::toStudentResponseDto)
                .orElse(null);

    }

    public List<StudentResponseDto> retrieveOneStudentByFirstName(String studentFirstName){

        return studentRepository.findAllByFirstNameContaining(studentFirstName).stream().map(studentMapper::toStudentResponseDto).collect(Collectors.toList());
    }

    public void deleteOneStudent(Integer studentId){

        studentRepository.deleteById(studentId);
    }
}
