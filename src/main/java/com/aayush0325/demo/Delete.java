package com.aayush0325.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.Map;


@RequestMapping("api")
@RestController
public class Delete {

    @DeleteMapping("delete")
    public ResponseEntity<Map<String, String>> delete(@RequestBody Map<String, String> reqBody) {
        boolean deleted = false;

        for (String key : reqBody.keySet()) {
            if (mockDB.mockDBMap.containsKey(key)) {
                mockDB.mockDBMap.remove(key);
                deleted = true;
            }
        }

        if (deleted) {
            return ResponseEntity.ok(Map.of("msg", "Deleted"));
        } else {
            return ResponseEntity.ok(Map.of("msg", "Not found"));
        }
    }
}
