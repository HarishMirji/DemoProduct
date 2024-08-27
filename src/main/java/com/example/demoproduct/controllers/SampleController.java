package com.example.demoproduct.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // End Point name is : GET  /hello
    @GetMapping("/hello")
    public  String helloWorld(){
        return "Hello World";
    }

    // End Point name is : GET  /hello/{name}
    @GetMapping("/hello/{name}")
    public  String helloWorld(@PathVariable("name") String name) {
        return "Hi "+ name + " how are you?";
    }

    // End Point name is : GET  /hello/{showId}/movie/{seatId}
    @GetMapping("/hello/{showId}/movie/{seatId}")
    public String bmsexample(@PathVariable("showId") String showId, @PathVariable("seatId") String seatId) {
        return  showId + " " + seatId;
    }
}
