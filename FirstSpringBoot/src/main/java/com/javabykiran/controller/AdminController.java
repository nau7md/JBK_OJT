package com.javabykiran.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.entity.Admin;

@RestController
public class AdminController {

	@Value("${admin.id}")
	int adminId;

	@Value("${admin.name}")
	String adminName;

	@GetMapping("/getAllAdmin")
	public String getAll() {

		System.out.println("Admin id is:" + adminId + " " + "and Admin name is:" + adminName);

		return "Get all Admin.......";

	}

	@RequestMapping("/getId")
	public int getId() {
		return 103;
	}

	@GetMapping("/getAdmin")
	public ArrayList<Admin> getAllAdmin() {
		ArrayList<Admin> list = new ArrayList<Admin>();
		list.add(new Admin(101, "Rishi", "Sales"));
		list.add(new Admin(102, "Amit", "Admin"));
		list.add(new Admin(103, "Nidhi", "Sales"));
		return list;
	}

}
