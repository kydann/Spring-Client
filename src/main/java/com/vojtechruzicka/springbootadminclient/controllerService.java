package com.vojtechruzicka.springbootadminclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerService {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(){
        return "Hello, I'm Client";
    }
    
    @RequestMapping(value = "/holi", method = RequestMethod.GET)
    public String greet(){
        return "Hello, I'm Client";
    }
    
    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String saludo(){
        return "Hello, I'm Client";
    }

}
