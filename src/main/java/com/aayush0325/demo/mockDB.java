package com.aayush0325.demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class mockDB {
    public static Map<String, String> mockDBMap = new HashMap<>();
    private mockDB(){};
}
