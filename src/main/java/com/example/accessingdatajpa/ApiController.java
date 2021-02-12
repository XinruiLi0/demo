package com.example.accessingdatajpa;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//    @GetMapping("/BuddyInfoUpdate")
//    public BuddyInfo BuddyInfoUpdate(@RequestParam(value = "name", defaultValue = "") String name, @RequestParam(value = "phoneNumber", defaultValue = "0") String phoneNumber, @RequestParam(value = "age", defaultValue = "0") String age) {
//        return name.equals("") ? null : new BuddyInfo(name, Long.parseLong(phoneNumber), Integer.parseInt(age));
//    }
}
