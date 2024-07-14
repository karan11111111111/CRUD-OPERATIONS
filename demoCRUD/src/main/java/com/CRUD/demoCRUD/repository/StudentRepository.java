package com.CRUD.demoCRUD.repository;

import com.CRUD.demoCRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
