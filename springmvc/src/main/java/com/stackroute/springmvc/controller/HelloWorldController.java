package com.stackroute.springmvc.controller;


@RequestMapping("/welcome")
public class HelloWorldController{

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView helloWorld(){

        ModelAndView model = new ModelAndView("HelloWorldPage");
        model.addObject("msg", "hello world");

        return model;
    }