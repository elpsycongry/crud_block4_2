package com.example.crud2.service;

import com.example.crud2.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;

    public IUserRepo getUserRepo() {
        return  userRepo;
    }
}
