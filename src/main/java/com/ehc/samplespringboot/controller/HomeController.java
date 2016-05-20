package com.ehc.samplespringboot.controller;

import com.ehc.samplespringboot.models.User;
import org.apache.commons.lang3.text.WordUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yamuna on 18/05/16.
 */
@Controller

public class HomeController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/employees/{empId}/{name}")
    public String employees(@PathVariable(value = "empId") String empId,@PathVariable(value = "name") String name, Model model){
        model.addAttribute("user","");
        model.addAttribute("employee");
        return "employees";
    }
    @RequestMapping(value = "/employees")
    public String employee(Model model){
        //after db call we get list of employees

        List<User> userList=new ArrayList<>();
        for(int i=0;i<10;i++){
        User user=new User();
        user.setId(i);
        user.setName("abc");
        user.setEmail("abc@gmail.com");
        user.setGender("Male");
           userList.add(user);
        }

        model.addAttribute("name","tester");
        model.addAttribute("employees",userList);
        return "employees";
    }


}
