package com.springboot.demo.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

  @Autowired private PropertiesRepository repository;

  @GetMapping("/api/properties")
  public Page<Properties> findAll() {
    return repository.findAll(PageRequest.of(0, 10));
  }
}
