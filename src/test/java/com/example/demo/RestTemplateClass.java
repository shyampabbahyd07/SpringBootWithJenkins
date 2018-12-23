package com.example.demo;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.mode.Employee;

public class RestTemplateClass {

	public static void main(String[] args) {
		/*final String uri = "http://localhost:8774/employee/shyam.json";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		System.out.println(result);private static void getEmployees()
		{*/
		    final String uri = "http://localhost:8774/employee/shyam";
		     
		    RestTemplate restTemplate = new RestTemplate();
		     
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		    ResponseEntity<Employee> result = restTemplate.exchange(uri, HttpMethod.GET, entity, Employee.class);
		     
		    System.out.println("result"+result.getBody());
		    
		   Employee emp= result.getBody();
		   System.out.println(emp.getEmail());
		   
		}
		
		
	}
