/*package com.example.demo;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.mode.Employee;


//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringStarterdemoApplicationTests {

	@Test
	public void getMessage() {
		SpringRestControllerEx springRestControllerEx = new SpringRestControllerEx();
		springRestControllerEx.getEmployeeInJSONREss("shyam");
		assertEquals("helloshyam", springRestControllerEx.getEmployeeInJSONREss("shyam"));
	}
}	
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
	public class SpringStarterdemoApplicationTests {
	    @Mock
	    private RestTemplate restTemplate;

	    @InjectMocks
	    private RestTemplateClass restTemplateClass;

	    @Test
	    public void testGetObjectAList() {
	    	Employee myobjectA = new Employee();
	        //define the entity you want the exchange to return
	        ResponseEntity<Employee> myEntity = new ResponseEntity<Employee>(HttpStatus.ACCEPTED);
	        Mockito.when(restTemplate.exchange(
	            Matchers.equalTo("/objects/get-objectA"),
	            Matchers.equalTo(HttpMethod.POST),
	            Matchers.<HttpEntity<Employee>>>any(),
	            Matchers.<ParameterizedTypeReference<List<Employee>>>any())
	        ).thenReturn(myEntity);

//	        List<ObjectA> res = springRestControllerEx.getEmployeeInJSON();
//	        Assert.assertEquals(myobjectA, res.get(0));
	    }
	    @Test 
	    public void use_post_http_method() { 
	    	RestTemplateClass service = new RestTemplateClass(); 
	    
	     RestTemplate restTemplate = mock(RestTemplate.class); 
	     ((Object) service).setRestTemplate(restTemplate); 
	     service.
	     service.post(); 
	    
	     verify(restTemplate).exchange(Mockito.anyString(), Mockito.<HttpMethod> eq(HttpMethod.POST), Mockito.<HttpEntity<?>> any(), Mockito.<Class<Object>> any()); 
	    } 
	    
	    @Test 
	    public void use_post_http_method() { 
	    	RestTemplateClass service = new RestTemplateClass(); 
	    
	    	RestTemplate restTemplate = PowerMockito.mock(RestTemplate.class);
	        PowerMockito.whenNew(RestTemplate.class).withNoArguments().
	              thenReturn(restTemplate);
	        } 
	    
	    
}
*/