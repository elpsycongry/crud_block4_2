package com.example.crud2.service;

import com.example.crud2.repository.IClassroomRepo;
import com.example.crud2.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService {
    @Autowired
    private IClassroomRepo classroomRepo;

    private IClassroomRepo getClassroomRepo() {return  this.classroomRepo;}
}


