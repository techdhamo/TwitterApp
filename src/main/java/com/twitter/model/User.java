package com.twitter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TWITTER_USERS")
public class User {
@Id
@Column(name = "USERNAME")
private String username;
@Column(name = "EMAIL")
private String email;
@Column(name = "MOBILE")
private String mobile;
@Column(name = "PASSWORD")
private String password; 

}