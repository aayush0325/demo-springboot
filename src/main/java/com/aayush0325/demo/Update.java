package com.aayush0325.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("api")

@RestController
public class Update {

    @PutMapping("update")
    ResponseEntity<Map<String, String>> update(@RequestBody Map<String, String> reqBody){
        boolean updated = false;
        for(Map.Entry<String, String>  entry : reqBody.entrySet()){
            if(mockDB.mockDBMap.containsKey(entry.getKey())){
                mockDB.mockDBMap.put(entry.getKey(), entry.getValue());
                updated = true;
            }
        }

        if(updated){
            return ResponseEntity.ok(Map.of("Msg", "done"));
        }else{
            return ResponseEntity.ok(Map.of("msg", "Not found"));
        }
    }
}
