package com.CRUD.demoCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.CRUD.demoCRUD.entity.Student;
import com.CRUD.demoCRUD.repository.StudentRepository;

@Component
public class DemoDataLoader implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        // Insert 5 students
        insertSampleStudents();
    }

    private void insertSampleStudents() {
//        Student student1 = new Student("John Doe", 85.5f, "Computer Science");
//        Student student2 = new Student("Jane Smith", 78.2f, "Electrical Engineering");
//        Student student3 = new Student("Michael Brown", 92.0f, "Mechanical Engineering");
//        Student student4 = new Student("Emily Davis", 79.8f, "Chemical Engineering");
//        Student student5 = new Student("David Wilson", 88.3f, "Civil Engineering");
//
//        // Save each student to the database
//        studentRepository.save(student1);
//        studentRepository.save(student2);
//        studentRepository.save(student3);
//        studentRepository.save(student4);
//        studentRepository.save(student5);
//
//        System.out.println("Sample students inserted successfully!");
  }
}
