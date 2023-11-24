package com.example.webtech_spring_mvc.repository;

import com.example.webtech_spring_mvc.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {}
