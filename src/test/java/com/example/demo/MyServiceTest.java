/*package com.example.demo;
import static org.mockito.Mockito.mock; 
import static org.mockito.Mockito.verify; 
 
import java.util.Map; 
 
import org.junit.Test; 
import org.junit.runner.RunWith; 
import org.mockito.Mockito; 
import org.springframework.http.HttpEntity; 
import org.springframework.http.HttpMethod; 
import org.springframework.web.client.RestTemplate; 
 
import com.googlecode.androidannotations.test15.AndroidAnnotationsTestRunner; 
 
@RunWith(AndroidAnnotationsTestRunner.class) 
public class MyServiceTest { 
 
 @Test 
 public void can_override_root_url() { 
  MyServiceTest myService = new MyServiceTest(); 
   
  RestTemplate restTemplate = mock(RestTemplate.class); 
  myService.setRestTemplate(restTemplate); 
 
  myService.setRootUrl("http://newRootUrl"); 
   
  myService.removeEvent(42); 
   
  verify(restTemplate).exchange(startsWith("http://newRootUrl"), Mockito.<HttpMethod> any(), Mockito.<HttpEntity<?>> any(), Mockito.<Class<Object>> any(), Mockito.<Map<String, ?>>any()); 
 
 } */