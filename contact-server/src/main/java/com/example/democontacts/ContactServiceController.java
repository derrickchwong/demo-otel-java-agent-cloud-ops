package com.example.democontacts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ContactServiceController {

  @Autowired
  private ContactRepository contactRepository;

  @PostMapping("/contacts")
  public Contact addContact(@RequestBody Contact contact){
    log.info("new contact {}", contact);
    return contactRepository.save(contact);
  }

  @GetMapping("/contacts/{id}")
  public Contact getContactById(@PathVariable Long id){

    return contactRepository.getReferenceById(id);
  }

}
