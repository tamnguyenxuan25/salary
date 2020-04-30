package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employee")
public class Employee {
    
    @Setter
    @Getter
    private int id;
    
    @Setter
    @Getter
    private String name;
    
    @Setter
    @Getter
    private String address;
    
    @Setter
    @Getter
    private String code;

}
