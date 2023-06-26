package com.example.democontacts;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

public class ContactClient {

  private final ContactService contactService;

  public ContactClient(WebClient webClient) {
    HttpServiceProxyFactory httpServiceProxyFactory =
        HttpServiceProxyFactory.builder(WebClientAdapter.forClient(webClient))
            .build();
    contactService = httpServiceProxyFactory.createClient(ContactService.class);

  }

  public ContactService getContactService() {
    return contactService;
  }
}
