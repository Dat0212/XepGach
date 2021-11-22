package com.example.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@RestController
public class MainController {

    @PostMapping("/Test")
    // @GetMapping("/Test")
    public String Test() {
        return "yo";
    }

    @PostMapping("/ClubAction")
    public ResponseModel ClubAction(@RequestBody RequestModel request) {

        ResponseModel res = new ResponseModel();

        return res;

    }
}
