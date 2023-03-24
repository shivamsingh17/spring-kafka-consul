package com.proj.myapp.service;

import com.proj.myapp.model.appmodel;

import java.util.List;

public interface serv {
    public List<appmodel> getAllCustomers();

    appmodel save(appmodel newUser);
}
