package com.example.democontacts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
    log.info("new contact {}", contact);

    if(Math.random() < 0.1){
      return ResponseEntity.status(500).build();
    }

    return ResponseEntity.ok(contactRepository.save(contact));
  }

  @GetMapping("/contacts/{id}")
  public ResponseEntity<Contact> getContactById(@PathVariable Long id){

    // return 500 error randomly
    if(Math.random() < 0.2){
      return ResponseEntity.status(500).build();
    }

    return ResponseEntity.ok(contactRepository.getReferenceById(id));
  }

}
