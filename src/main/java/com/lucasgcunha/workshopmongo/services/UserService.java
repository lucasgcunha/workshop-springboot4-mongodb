package com.lucasgcunha.workshopmongo.services;

import com.lucasgcunha.workshopmongo.domain.User;
import com.lucasgcunha.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
