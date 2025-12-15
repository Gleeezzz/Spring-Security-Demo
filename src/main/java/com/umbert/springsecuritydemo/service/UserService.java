//package com.umbert.springsecuritydemo.service;
//
//import com.umbert.springsecuritydemo.model.User;
//import com.umbert.springsecuritydemo.repository.UserRepository;
//import com.umbert.springsecuritydemo.dto.SignUpForm;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public User registerUser(SignUpForm signUpForm) {
//        User user = new User();
//        user.setFirstName(signUpForm.getFirstName());
//        user.setLastName(signUpForm.getLastName());
//        user.setEmail(signUpForm.getEmail());
//        // Hash le password avant de le sauvegarder
//        user.setPassword(signUpForm.getPassword());
//
//        return userRepository.save(user);
//    }
//}
