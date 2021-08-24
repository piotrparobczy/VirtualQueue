package com.apator.virtualQueue.controller;

import com.apator.virtualQueue.dto.CaseDto;
import com.apator.virtualQueue.services.QueueServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaseCreationController {

    private final QueueServices queueServices;

    public CaseCreationController(QueueServices queueServices) {
        this.queueServices = queueServices;
    }


    @GetMapping(value = "/")
    public String getCase (Model model){
        CaseDto caseDto = new CaseDto();
        model.addAttribute("caseDto", caseDto);
        return "caseCreation";
    }

    @PostMapping("/")
    public String  postCase(CaseDto caseDto,Model model) {
        //todo check if pin is correct
//        if (checkPin(caseDto,model)){
//            model.addAttribute("error","Pin is incorrect");
//            return "" ;
//        }
        queueServices.createCase(caseDto);
        return "redirect:/waitingTime";
    }

    private boolean checkPin(CaseDto caseDto, Model model) {
        if (caseDto.getType().equals("vip") &&
                model.getAttribute("pin").equals("0001") ||
        caseDto.getType().equals("emergency") &&
        model.getAttribute("pin").equals("0002")){
            //todo change to false
            return true;
        }
        return true;
    }

}
