package com.chang.bingbingweb.controller;



import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Controller  让组件扫描将类识别为一个组件
 */
@Slf4j
@Controller
public class HomeController {
    @GetMapping("")
    public String home(){
        return "home";
    }

}
