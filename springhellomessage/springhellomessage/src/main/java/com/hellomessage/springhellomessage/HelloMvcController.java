package com.hellomessage.springhellomessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloMvcController {

    @GetMapping("/web")
        public String hello(){
            return "message";
        }
        @GetMapping("/web/message")
        public String message(Model model){
        model.addAttribute("message", "Hello From Bridgelabz");
return "message";
        }
    }

