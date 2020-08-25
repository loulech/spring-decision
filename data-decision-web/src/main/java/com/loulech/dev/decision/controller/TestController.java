package com.loulech.dev.decision.controller;

import com.loulech.dev.decision.core.DecisionEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private DecisionEngine decisionEngine;

    @GetMapping("/1")
    public String test(){
        decisionEngine.fire("asdasd");
        return "abacsasd1";
    }
}
