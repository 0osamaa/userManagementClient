package com.osama.usermanagementclient;

import com.osama.usermanagementclient.methods.restTemplateUsingEntityMethod;
import com.osama.usermanagementclient.methods.restTemplateUsingExchangeMethod;
import com.osama.usermanagementclient.methods.restTemplateUsingobjectMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserManagementClientApplication.class, args);

        restTemplateUsingExchangeMethod exchangeMethod = new restTemplateUsingExchangeMethod();
        exchangeMethod.driverMethod();

        restTemplateUsingEntityMethod forEntity = new restTemplateUsingEntityMethod();
        forEntity.driverMethod();

        restTemplateUsingobjectMethod object = new restTemplateUsingobjectMethod();
        object.driverMethod();


    }


}

