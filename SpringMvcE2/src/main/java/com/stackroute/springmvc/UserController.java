package com.stackroute.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;

@Controller
@RequestMapping(path = "/add")
public class UserController  {

    @RequestMapping(method = RequestMethod.POST)
    public String display(Model model, User user){

        System.out.println("msg:"+user.getString()  );
        model.addAttribute("user",user);
       return "display";
    }
}
