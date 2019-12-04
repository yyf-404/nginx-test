package com.yyf.nginxtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
public class HeadController {
    @ResponseBody
    @RequestMapping("/head")
    public String testHead(HttpServletRequest request){
        Enumeration<String> headerNames = request.getHeaderNames();
        StringBuffer sbf =new StringBuffer();
        while(headerNames.hasMoreElements()){
            String element = headerNames.nextElement();
            System.out.println(element+":"+request.getHeader(element));
            sbf.append(element+":"+request.getHeader(element)+"/n");
        }
   return   sbf.toString();
    }
}
