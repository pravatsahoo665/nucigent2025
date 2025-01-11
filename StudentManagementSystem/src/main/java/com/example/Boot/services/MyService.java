package com.example.Boot.services;

import java.util.List;

import com.example.Boot.domains.StudentManagement;

public interface MyService {
	public void insertdata(StudentManagement s);
	public void updatedata(StudentManagement s);
	public void deletedata(StudentManagement s);
	public List<StudentManagement> fetch();


}
