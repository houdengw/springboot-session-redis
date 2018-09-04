package com.hdw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Title: evils
 * CreateDate:  2018/9/4
 *
 * @author houdengw
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/set")
    public String getSession(HttpServletRequest request){

        String username = (String)request.getSession().getAttribute("username");

        if(username==null){
            request.getSession().setAttribute("username","admin"+request.getLocalPort());
        }

        return "test results:"+request.getSession().getAttribute("username");

    }
}
