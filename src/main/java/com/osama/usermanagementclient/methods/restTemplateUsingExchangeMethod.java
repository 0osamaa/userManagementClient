package com.osama.usermanagementclient.methods;

import com.osama.usermanagementclient.dto.Student;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class restTemplateUsingExchangeMethod {
    RestTemplate restTemplate = new RestTemplate();
    private String baseUrl = "http://localhost:8080/";

    public void driverMethod() {
        useExchangeMethodsOfResttemplate();
        getAllStudentsExchangeMethodsOfResttemplate();
        System.out.println("system is running");
        addStudentExchangeMethodsOfResttemplate();
    }

    private void useExchangeMethodsOfResttemplate() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> entity = new HttpEntity<>(headers);

        ResponseEntity<Student> responseClassObject = restTemplate.exchange(baseUrl + "stu/11",
                HttpMethod.GET,
                entity,
                Student.class
        );

        Student student = responseClassObject.getBody();
        System.out.println("user : " + student);

    }

    private void getAllStudentsExchangeMethodsOfResttemplate() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> entity = new HttpEntity<>(headers);

        ResponseEntity<List> responseClassObject = restTemplate.exchange(baseUrl + "all",
                HttpMethod.GET,
                entity,
                List.class
        );

        List student = responseClassObject.getBody();
        System.out.println("user : " + student);

    }

    private void addStudentExchangeMethodsOfResttemplate() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);


        Student student = new Student();
        student.setId(30);
        student.setName("Asad");
        student.setDepartment("IVR");

        HttpEntity<Object> entity = new HttpEntity<>(student, headers);

        ResponseEntity<Student> responseClassObject = restTemplate.exchange(baseUrl + "/student",
                HttpMethod.POST,
                entity,
                Student.class
        );

        Student student2 = responseClassObject.getBody();
        System.out.println("user : " + student2);

    }


}
