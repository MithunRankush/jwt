package com.jwt.securitytokens.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="USERS")
public class User {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @Column
	    private String username;
	    @Column
	    @JsonIgnore
	    private String password;
}
