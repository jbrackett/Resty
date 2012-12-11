package com.resty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  public String helloWorld(Model model) {
    model.addAttribute("wisdom", "Goodbye XML");

    return "hello";
  }

}
