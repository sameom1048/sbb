package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

    @GetMapping("/sbb")
    @ResponseBody
    public String  index() {
        return "index";
    }
}
