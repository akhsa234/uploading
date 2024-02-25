package com.bahar.buploadingvideo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
       })
   public class User{


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "users_sec")
    @SequenceGenerator(name = "users_sec", sequenceName = "users_sec", allocationSize = 1)
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private String email;
    private Integer active;
    private Date created;
    private Date modified;

    public User(){ }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
  public User(String username, String password){
    this.username=username;
    this.password=password;
    this.created=new Date();
    this.modified=new Date();
  }
        public User(String username, String password, String email, Integer active){
        this.username=username;
        this.password=password;
        this.email=email;
        this.active=active;
        this.created=new Date();
        this.modified=new Date();
        }


}
