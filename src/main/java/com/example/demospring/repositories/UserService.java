package com.example.demospring.repositories;

import com.example.demospring.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    HibernateRepo hr;
    public UserService(HibernateRepo hr) {
        this.hr = hr;
    }
    public List<User> getUsers(){
        return hr.findAll();
    }
}