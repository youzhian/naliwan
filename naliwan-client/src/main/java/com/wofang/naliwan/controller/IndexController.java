package com.wofang.naliwan.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class IndexController extends BaseController {

    @RequestMapping("/")
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView("index");

        return mv;

    }
}
