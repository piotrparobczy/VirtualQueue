package com.apator.virtualQueue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CaseCreationController {

    @GetMapping(value = "/")
    public String getCase (){
        return "caseCreation";
    }

    @PostMapping("/")
    public String postCase(Model model) {
        return "waitingTime";
    }
}
