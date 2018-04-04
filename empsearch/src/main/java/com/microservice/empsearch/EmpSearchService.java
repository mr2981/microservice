package com.microservice.empsearch;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpSearchService {
	
	private static Map < Long, Emp > EmployeeRepsitory = null;
	
	 static {
	  Stream < String > employeeStream = Stream.of("1,Madhulika,Java,Architect", "2,Anvi,C++,Manager",
	   "3,Alok,AI,Sr.Architect");
	  EmployeeRepsitory = employeeStream.map(employeeStr -> {
		  String[] info = employeeStr.split(",");
	   return createEmployee(new Long(info[0]), info[1], info[2], info[3]);
	  }).collect(Collectors.toMap(Emp::getEmployeeId, emp -> emp));
	 }
	 
	 private static Emp createEmployee(Long id, String name, String practiceArea, String designation) {
	  Emp emp = new Emp();
	  emp.setEmployeeId(id);
	  emp.setName(name);
	  emp.setPracticeArea(practiceArea);
	  emp.setDesignation(designation);
	  emp.setCompanyInfo("Band");
	  return emp;
	 }
	 public Emp findById(Long id) {
	  return EmployeeRepsitory.get(id);
	 }
	 public Collection < Emp > findAll() {
	  return EmployeeRepsitory.values();
	 }
	}