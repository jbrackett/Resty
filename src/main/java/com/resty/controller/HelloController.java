package com.resty.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resty.domain.Result;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  public String helloWorld(Model model) {
    model.addAttribute("wisdom", "Goodbye XML");

    return "hello";
  }

  @RequestMapping(value = "/hello", produces = "application/json")
  @ResponseBody
  public String helloWorldJson() {
    return "{\"result\": \"hello\"}";
  }

  @RequestMapping(value = "random", produces = "application/json")
  @ResponseBody
  public Result randomMessage() {
    List<String> messages = new ArrayList<>();
    messages.add("hello");
    messages.add("hola");
    messages.add("hallo");
    messages.add("Hallå");
    messages.add("ahoj");

    Random rand = new Random();
    int randomInt = rand.nextInt(5);

    return new Result(messages.get(randomInt));
  }

}
