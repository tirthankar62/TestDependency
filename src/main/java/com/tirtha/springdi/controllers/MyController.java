package com.tirtha.springdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by tirthankarmitra on 08/06/18.
 */
@Controller
public class MyController {

    public String hello()
    {
        System.out.println("helooo");
        return "aaa";
    }
}
