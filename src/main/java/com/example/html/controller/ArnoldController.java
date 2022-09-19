package com.example.html.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //retunere html side
public class ArnoldController {

    //Altid string, da framework forventer en String

    @GetMapping("/")
    public String index(){
        return "index"; //html fil der ligger i templates
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/opg2")
    public String opg2(){
        return "opg2";
    }

    @GetMapping("/box")
    public String box(){
        return "box";
    }




}
