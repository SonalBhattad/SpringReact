package com.example.springh2.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id
@GeneratedValue
private int id;
private String name;
private String captain;
private String owner;
}