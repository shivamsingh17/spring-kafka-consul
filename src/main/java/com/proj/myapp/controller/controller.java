package com.proj.myapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.proj.myapp.config.configpr;
import com.proj.myapp.model.appmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.proj.myapp.repository.repo;
import com.proj.myapp.service.serv;

import java.rmi.ServerException;
import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class controller {
    @Autowired
    private repo reps;
    @Autowired
    serv servc;
@Autowired
    configpr con;

    @GetMapping
    public ResponseEntity<?> getDetail() throws JsonProcessingException {
        List<appmodel> custoemerList = servc.getAllCustomers();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(custoemerList);
        System.out.println(json);
        System.out.println(con.getA());

        return new ResponseEntity<>(custoemerList, HttpStatus.OK);
    }
    @PostMapping(path = "users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<appmodel> create(@RequestBody final appmodel newUser) {
        appmodel user = servc.save(newUser);

            return new ResponseEntity<>(user, HttpStatus.CREATED);

    }

}
