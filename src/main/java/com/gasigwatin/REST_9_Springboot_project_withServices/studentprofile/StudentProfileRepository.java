package com.gasigwatin.REST_9_Springboot_project_withServices.studentprofile;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Integer> {
}
