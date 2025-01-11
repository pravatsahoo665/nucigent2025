package com.example.Boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Boot.domains.StudentManagement;
import com.example.Boot.repositories.Repo;

@Service
public class implService implements MyService {
	@Autowired
	public Repo r;

	@Override
	public void insertdata(StudentManagement s) {
		r.save(s);
		
		System.out.println("insert service impl worked");
	}

	@Override
	public void updatedata(StudentManagement s) {
		r.save(s);
		System.out.println("update service impl worked..");

	}

	@Override
	public void deletedata(StudentManagement s) {
		r.delete(s);
		System.out.println("delete service impl worked.......");

	}

	@Override
	public List<StudentManagement> fetch() {
		List<StudentManagement>list=r.findAll();
		System.out.println("fetch service impl worked-------");

		return list;
		
	}

}
