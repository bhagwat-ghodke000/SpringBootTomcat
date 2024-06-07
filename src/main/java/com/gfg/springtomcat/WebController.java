package com.gfg.springtomcat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WebController {
	
	
    @RequestMapping(value="/hello")
    public String getMessage()
    {
        return "Spring Boot Application running on Tomcat server!!";
    }
}