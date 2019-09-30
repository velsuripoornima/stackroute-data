package com.stackroute.springmvce1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {
// <a class="vglnk" href="http://localhost:8080/SpringMVC-Annotation/controller/firstmvc.htm" rel="nofollow"><span>http</span><span>://</span><span>localhost</span><span>:</span><span>8080</span><span>/</span><span>SpringMVC</span><span>-</span><span>Annotation</span><span>/</span><span>controller</span><span>/</span><span>firstmvc</span><span>.</span><span>htm</span></a>

    @RequestMapping(path="/", method=RequestMethod.GET)
    public String firstMVController() {
        System.out.println("bhoom controller");
        ModelAndView modelAndView = new ModelAndView("showMessage");
        modelAndView.addObject("message", "Welcome To Spring MVC Annotation based web application");
        return "index";
    }
//
//    public String add(){
//        return "index";
//    }

}
