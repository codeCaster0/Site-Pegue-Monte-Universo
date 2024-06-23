package com.pegue_monte_universo.site.controller;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class MiscController {
  @GetMapping("/peguemonteuniverso")
public String requestSite(){
    return "index";
}  
}
