package com.gasigwatin.REST_9_Springboot_project_withServices;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController{

        private final SchoolRepository schoolRepository;

        public SchoolController(SchoolRepository schoolRepository) {
            this.schoolRepository = schoolRepository;
        }

        @PostMapping("/schools")
        public SchoolDto postSchoolDetails(
                @RequestBody SchoolDto schoolDto){

            var school = toSchool(schoolDto);

            var savedSchool = schoolRepository.save(school);

            return schoolDto;

        }

        //Our School should only return the school name, so we have to use a dto to perform that

        private School toSchool(SchoolDto dto){
            return new School(dto.schoolName());

        }


        private SchoolDto toSchoolDto(School school){
            return new SchoolDto(school.getSchoolName());
        }

        //Here we don't need to expose the school (using the List<School>); instead we can
        @GetMapping("/schools")
        public List<SchoolDto> getAllSchools(){
            return  schoolRepository.findAll()
                    .stream()
                    .map(this::toSchoolDto)
                    .collect(Collectors.toList());

        }

        @GetMapping("/schools/search/{school-id}")
        public School getOneSchool(
                @PathVariable("school-id") Integer schoolId){

            return schoolRepository.findById(schoolId).orElse(new School());

        }
    }
