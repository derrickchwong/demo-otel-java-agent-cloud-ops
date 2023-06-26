package com.example.democontacts;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

public interface ContactService {

  @PostExchange("/contacts")
  Contact newContact(@RequestBody Contact contact);
}
