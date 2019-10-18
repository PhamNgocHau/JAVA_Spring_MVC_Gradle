package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailController {
    @GetMapping("show-email")
    public String getEmailHome(){
        return "email_home"; // view name = jsp
    }
}
