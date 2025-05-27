package com.gasigwatin.REST_9_Springboot_project_withServices;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

        List<Student> findAllByFirstNameContaining(String studentFirstName);
    }
