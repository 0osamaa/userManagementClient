package com.osama.usermanagementclient.methods;

import com.osama.usermanagementclient.dto.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class restTemplateUsingEntityMethod {

    RestTemplate restTemplate = new RestTemplate();
    private String baseUrl = "http://localhost:8080/";

    public void driverMethod() {
        getForSingleEntity();
        getForAllEntity();
        postForSingleEntity();
        deleteForSingleEntity();

    }

    private void getForSingleEntity() {
        String url = baseUrl + "/stu/11";
        ResponseEntity<Student> response = restTemplate.getForEntity(url, Student.class);

        Student newResponse = response.getBody();
        System.out.println("Response getting from application " + newResponse);

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

    private void deleteForSingleEntity() {
        String url = baseUrl + "/stu/7";
        restTemplate.delete(url);

        System.out.println("Student Successfully deleted from Database ....:)");

    }

}
