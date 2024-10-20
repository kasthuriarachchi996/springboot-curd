package com.sprigCrud.sprigCrud.student;


import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    public StudentDto saveStudent(StudentDto studentDto) {
        studentRepository.save(modelMapper.map(studentDto ,Student.class));
        return studentDto;
    }

    public List<StudentDto> getAllUers() {
        List<Student>studentList =studentRepository.findAll();
        return modelMapper.map(studentList ,
                new TypeToken<List<StudentDto>>(){}.getType());
    }
}
