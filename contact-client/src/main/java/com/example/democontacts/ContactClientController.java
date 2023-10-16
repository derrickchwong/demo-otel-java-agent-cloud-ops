package com.example.democontacts;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ContactClientController {

  ContactClient contactClient;

  public ContactClientController(ContactClient contactClient) {
    this.contactClient = contactClient;
  }

  @PostMapping("/contacts")
  public Contact addContact(@RequestBody Contact contact){
    log.info("calling contact server for adding contact {}", contact);
    
    ContactService contactService = contactClient.getContactService();
    return contactService.newContact(contact);
  }

}
