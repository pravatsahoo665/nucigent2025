package com.example.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Boot.domains.StudentManagement;

public interface Repo extends JpaRepository<StudentManagement, Integer>{

}
