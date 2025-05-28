package com.gasigwatin.REST_9_Springboot_project_withServices.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {

    //Our School should only return the school name, so we have to use a dto to perform that

    public School toSchool(SchoolDto dto){

        return new School(dto.schoolName());
    }

    public SchoolDto toSchoolDto(School school){
        return new SchoolDto(school.getSchoolName());
    }
}
