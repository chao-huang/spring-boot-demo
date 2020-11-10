package com.springboot.demo.context;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
public class Properties {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long id;

  @NotNull private String name;

  @Column(length = 500)
  private String value;

  private String application;

  private String profile;

  private String label;
}
