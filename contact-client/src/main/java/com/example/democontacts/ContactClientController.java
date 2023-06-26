package com.example.democontacts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@Slf4j
public class ContactClientController {

  @PostMapping("/contacts")
  public Contact addContact(@RequestBody Contact contact){
    log.info("calling contact server for adding contact {}", contact);
    ContactClient contactClient = new ContactClient(WebClient.builder()
        .baseUrl("http://contact-server:80")
        .build());
    ContactService contactService = contactClient.getContactService();
    return contactService.newContact(contact);
  }

}
