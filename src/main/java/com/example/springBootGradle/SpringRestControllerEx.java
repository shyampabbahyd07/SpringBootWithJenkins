package com.example.springBootGradle;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootGradle.Employee;

@RestController
@RequestMapping("employee")
public class SpringRestControllerEx {
	
	/*@RequestMapping(value="/{name}", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody Employee getEmployeeInJSON(@PathVariable String name){
		 
		Employee emp = new Employee();
		emp.setEmail("s@gmail.com");
		emp.setName(name);
		
		return emp;
		
	}*/
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET, produces="application/xml")
	public ResponseEntity<Employee> getEmployeeInJSONREss(@PathVariable String name){
		 
		Employee emp = new Employee();
		emp.setEmail("s1@gmail.com");
		emp.setName(name);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/GetMap/{name}", produces="application/json")
	public ResponseEntity<Employee> getEmployeeInGetMapping(@PathVariable String name){
		 
		Employee emp = new Employee();
		emp.setEmail("s1@gmail.com");
		emp.setName(name);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/xml/getEmployee", produces="application/xml")
	public Employee getEmployeeInXML(@RequestParam(value="param1") String pname){
		 
		Employee emp = new Employee();
		emp.setEmail("s@gmail.com");
		emp.setName(pname);
		
		return emp;
		
	}

}
