package com.example.threelayerarch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpringControl {

    @Autowired
    StingService service;

    @GetMapping(value = "/hello")

    public List<String> getString() {

        List<String> list = service.getList();
        return list;


    }


}
