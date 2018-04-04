package com.microservice.empsearch;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EmpSearchController {
	
	 @Autowired
	 EmpSearchService empSearchService;
	 @RequestMapping("/employee/{id}")
	 public Emp findById(@PathVariable Long id) {
	  return empSearchService.findById(id);
	 }
	 @RequestMapping("/employee/findall")
	 public Collection < Emp > findAll() {
	  return empSearchService.findAll();
	 }
	}

