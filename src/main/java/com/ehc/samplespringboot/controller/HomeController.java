package com.ehc.samplespringboot.controller;

import org.apache.commons.lang3.text.WordUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Yamuna on 18/05/16.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    public String index(){
        return "index";
    }
    @RequestMapping(value = "employees/{empId}/{name}")
    public String employees(@PathVariable(value = "empId") String empId,@PathVariable(value = "name") String name, Model model){
        model.addAttribute("user","");
        model.addAttribute("employee");
        return "employees";
    }
    @RequestMapping(value = "employees")
    public String employee(@RequestParam(value = "empId") String empId, Model model){
        model.addAttribute("employee");
        return "employees";
    }


}
