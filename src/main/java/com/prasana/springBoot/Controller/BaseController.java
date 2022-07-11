package com.prasana.springBoot.Controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public String landingPage(){
        return "This is the First page";
    }
}
