package com.example.democontacts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ContactServiceConfig {
    

    @Bean
    public ContactClient contactClient(){

        ContactClient contactClient = new ContactClient(WebClient.builder()
        .baseUrl("http://contact-server:80")
        .build());

        return contactClient;
    }
}
