package com.example.democontacts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contact {

  private Long id;
  private String name;
  private String phone;
  private String address;

}
