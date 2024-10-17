package com.aayush0325.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("api")
@RestController
public class Create {

    @Autowired

    @PostMapping("create")
    public ResponseEntity<Map<String, String>> update(@RequestBody Map<String, String> reqBody) {
        mockDB.mockDBMap.putAll(reqBody);

        Map<String, String> response = Map.of("msg", "added");

        return ResponseEntity.ok(response);
    }
}
