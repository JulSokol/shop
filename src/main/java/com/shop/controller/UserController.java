package com.shop.controller;


import com.shop.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/user")
    public String usr(
            Model model
    ){
        model.addAttribute("users", userRepo.findAll());
      return "user";
    }

    @PostMapping("/user/delete")
    public String deleteUser(
        @RequestParam("id") Long id
    ){
        userRepo.deleteById(id);
        return "redirect:/user";
    }

}
