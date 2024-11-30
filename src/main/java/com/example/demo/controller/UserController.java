
package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author LAB_P03
 */
@Controller
public class UserController {
    
   @GetMapping("/form")
   public String showForm(Model modelo){
        modelo.addAttribute("user", new User());
        return "form";
    }
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model modelo){
        modelo.addAttribute("user", user);
        return "success";
    }
}
