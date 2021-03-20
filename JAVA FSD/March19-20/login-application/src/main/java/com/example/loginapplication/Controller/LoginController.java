package com.example.loginapplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
    @PostMapping("/processRequest")
    public String processRequest(@RequestParam("name") String name, ModelMap modelMap)
    {
        modelMap.addAttribute("k1",name);
        return "processForm";
    }

}
