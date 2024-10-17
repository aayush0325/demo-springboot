package com.aayush0325.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("api")

@RestController
public class Read {

    @GetMapping("read")
    public Map<String, String> readController(){
        return mockDB.mockDBMap;
    }
}
