package com.yuwaan.config.configconsumer.controller;

import com.yuwaan.config.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    MemberProfileConfiguration configuration;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public MemberProfileConfiguration getConfiguration() {
        return configuration;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

}
