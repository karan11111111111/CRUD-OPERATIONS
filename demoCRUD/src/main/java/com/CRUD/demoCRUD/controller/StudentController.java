package com.CRUD.demoCRUD.controller;

import com.CRUD.demoCRUD.entity.Student;
import com.CRUD.demoCRUD.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    //get all the students
    //localhost:8081/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    //localhost:8081/students/1
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){

        return studentRepository.findById(id).get();
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public  void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable int id){
    Student student  =  studentRepository.findById(id).get();
    student.setName("poonam");
    student.setPercentage(92);
    studentRepository.save(student);
    return student;
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable int id){
    studentRepository.deleteById(id);
    }
}
