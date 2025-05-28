package com.gasigwatin.REST_9_Springboot_project_withServices.school;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper){
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolDto saveSchoolDetails(SchoolDto schoolDto){

        var school = schoolMapper.toSchool(schoolDto);
        var savedSchool = schoolRepository.save(school);
        return schoolDto;
    }

    public List<SchoolDto> getAllSchools(){

        return schoolRepository.findAll().stream().map(schoolMapper::toSchoolDto).collect(Collectors.toList());
    }

    public SchoolDto getOneSchool(Integer schoolId){

        return schoolRepository.findById(schoolId).map(schoolMapper::toSchoolDto).orElse(null);
    }
}
