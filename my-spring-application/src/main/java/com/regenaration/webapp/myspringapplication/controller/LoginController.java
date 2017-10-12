package com.regenaration.webapp.myspringapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public String createOwner(Model model) {
        return "createOwner";
    }

}


