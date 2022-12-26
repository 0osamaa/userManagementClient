package com.osama.usermanagementclient.methods;

import com.osama.usermanagementclient.dto.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class restTemplateUsingobjectMethod {

    RestTemplate restTemplate = new RestTemplate();
    private String baseUrl = "http://localhost:8080/";

    public void driverMethod() {
        getForSingleObject();
        getForAllEntity();
        postForSingleEntity();

    }

    private void getForSingleObject() {
        String url = baseUrl + "/stu/11";
        Student response = restTemplate.getForObject(url, Student.class);

        Student newResponse = new Student();
        newResponse.getId();
        newResponse.getName();
        newResponse.getDepartment();


        System.out.println("Response getting from application via getForObject" + newResponse);

    }

    private void getForAllEntity() {
        String url = baseUrl + "/all";
        ResponseEntity<List> response = restTemplate.getForEntity(url, List.class);

        List newResponse = response.getBody();
        System.out.println("Response getting from application " + newResponse);
    }

    private void postForSingleEntity() {
        String url = baseUrl + "/student";
        Student student = new Student();
        student.setId(00);
        student.setName("Ashad");
        student.setDepartment("ComputerScience");

        ResponseEntity<Student> response = restTemplate.postForEntity(url, student, Student.class);

        Student newResponse = response.getBody();
        System.out.println("New Student Created " + newResponse);


    }
}
