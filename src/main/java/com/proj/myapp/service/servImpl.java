package com.proj.myapp.service;

import com.proj.myapp.model.appmodel;
import com.proj.myapp.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servImpl implements serv{

    @Autowired
    repo reps;



    @Override
    public List<appmodel> getAllCustomers() {
        List<appmodel> check = reps.findAll();
        return check;
    }

    @Override
    public appmodel save(appmodel newUser) {
        return reps.save(newUser);
    }
}
