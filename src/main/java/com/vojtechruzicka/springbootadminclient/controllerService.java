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

}
