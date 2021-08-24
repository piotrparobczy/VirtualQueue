package com.apator.virtualQueue.controller;

import com.apator.virtualQueue.dto.CaseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WaitingTimeController {

    @GetMapping(value = "/waitingTime")
    public String getTime (Model model){
        return "waitingTime";
    }
}
