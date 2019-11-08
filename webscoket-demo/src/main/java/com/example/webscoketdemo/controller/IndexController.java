package com.example.webscoketdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class IndexController {

    @RequestMapping(value = "toIndex")
    public ModelAndView toIndex(){
        return new ModelAndView("index");
    }

    @RequestMapping(value = "test")
    public void test(HttpServletRequest request, HttpServletResponse response){

        System.out.println("kkk.....");
        try {
            response.getWriter().print("ok...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}