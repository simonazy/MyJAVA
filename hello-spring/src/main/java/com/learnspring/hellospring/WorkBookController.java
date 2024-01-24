package com.learnspring.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkBookController {

    // @GetMapping(value = "/")
    // public String getSign(Model model){
    //     model.addAttribute("speed", 70);
    //     return "sign";

    // }
    @GetMapping(value = "/")
    public String home(){
        return "home";
    } 

    @GetMapping(value = "/away")
    public String away(){
        return "away";
    }
}
