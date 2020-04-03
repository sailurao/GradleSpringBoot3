package com.example.demo;

import org.springframework.data.jpa.repository.Query;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity;
@Table(name="user")
public class UserEntity {
    //@GeneratedValue
    @Id
    private int user_id;



    private String first_name;


    private String middle_name;



    private String last_name;


    private String address;


    private String email;


    private String mobile_number;


    private String password;


    public UserEntity() {
        super();
    }


    public UserEntity(UserEntity usr) {
        super();
        this.user_id=usr.user_id;
        this.address=usr.address;
        this.email=usr.email;
        this.first_name=usr.first_name;
        this.last_name=usr.last_name;
        this.mobile_number=usr.mobile_number;
        this.password=usr.password;
        this.middle_name=usr.middle_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int userId) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String firstName) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailId) {
        this.email = email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobileNumber) {
        this.mobile_number = mobile_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
