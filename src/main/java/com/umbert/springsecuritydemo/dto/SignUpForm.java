package com.umbert.springsecuritydemo.dto;


import lombok.Data;

@Data
public class SignUpForm {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
}
