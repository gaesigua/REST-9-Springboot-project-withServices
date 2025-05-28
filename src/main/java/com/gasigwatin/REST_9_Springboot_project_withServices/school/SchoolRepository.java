package com.gasigwatin.REST_9_Springboot_project_withServices.school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
