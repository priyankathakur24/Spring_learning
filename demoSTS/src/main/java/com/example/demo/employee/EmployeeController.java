package com.example.demo.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	

	private  List<Employee> emp= new ArrayList<Employee>(Arrays.asList(new Employee(12,"Suuny",750736442),
			new Employee(13,"Pt",34567890),new Employee(14,"Mayu",23456789)));
	
	@GetMapping("/")
	public Employee getEmployee(@PathParam("id") int id){
		Employee em=null;
		for(Employee e:emp) {
			if(e.getEmp_id()==id) {
				em=e;
			}
		}
		return em;
	}
	
	@GetMapping("/getEmp/{id}")
	public Employee getEmployeebyPathVariable(@PathVariable("id") int id){
		Employee em=null;
		for(Employee e:emp) {
			if(e.getEmp_id()==id) {
				em=e;
			}
		}
		return em;
	}
	
	@PostMapping("/getEmp/{id}")
	public Employee getEmployeebyPost(@PathVariable("id") int id){
		Employee em=null;
		for(Employee e:emp) {
			if(e.getEmp_id()==id) {
				em=e;
			}
		}
		return em;
	}
	
	@RequestMapping(value = "/getEmpbyPost",method = RequestMethod.POST)
	public Employee getEmployeebyPostJson(@RequestBody Employee empl){
		
		for(Employee e:emp) {
			if(e.getEmp_id()==empl.getEmp_id()) {
				empl=e;
			}
		}
		return empl;
	}
	

	
}
