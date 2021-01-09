package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping(value = "/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping(value = "/user")
    public String getUserPage() {
        return "user";
    }

//    @GetMapping(value = {"/", "/hello"})
//    public String welcome(Model model) {
//        return "hello";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }

//    @GetMapping("/")
//    public String getUsers(Model model){
//        model.addAttribute("users", userService.getUsers());
//        return "users";
//    }
//
//    @GetMapping("/{id}")
//    public String user(@PathVariable("id") int id, Model model) {
//        model.addAttribute("user", userService.getById(id));
//        return "user";
//    }
//
//    @GetMapping("/new")
//    public String newUser(@ModelAttribute User user) {
//        return "newUser";
//    }
//
//    @PostMapping("/new")
//    public String createUser(@ModelAttribute User user) {
//        userService.add(user);
//        return "redirect:/";
//    }
//
//    @GetMapping("/update")
//    public String updateUser(@RequestParam(value = "id") int id, Model model) {
//        model.addAttribute("user", userService.getById(id));
//        return "updateUser";
//    }
//
//    @PostMapping("/update")
//    public String update(@ModelAttribute User user) {
//        userService.update(user);
//        return "redirect:/";
//    }
//
//    @GetMapping("/delete")
//    public String deleteUser(@RequestParam int id, Model model) {
//        userService.delete(id);
//        return "redirect:/";
//    }
}
