package com.example.user.model;

import javax.persistence.*;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Integer id;
    
    @Column(name="name",length=255)
    private String name;
    
    @Column(name="address",length=255)
    private String address;
    
    @Column(name="age",nullable = false)
    private Integer age;
    
    @Column(name="sax",length=255)
    private String sax;
}

