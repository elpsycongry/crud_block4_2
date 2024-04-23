package com.example.crud2.repository;

import com.example.crud2.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassroomRepo extends JpaRepository<Classroom, Long> {
}
