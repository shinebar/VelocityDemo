package com.wjs.springvelocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 341039 on 2016/11/1.
 */
@Controller
public class UserController {

    @RequestMapping(value = "hellos")
    public ModelAndView printWelcome(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "welcome to velocity!");
        mav.setViewName("/hello");
        System.out.println("dddd");
        return mav;
    }

    @RequestMapping(value = "index")
    public ModelAndView index(HttpServletRequest request ,HttpServletResponse response){
        ModelAndView mav=new ModelAndView();
        mav.addObject("messge","index jsp welcome");
        mav.setViewName("/index");
        return mav;
    }
}
