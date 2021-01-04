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

    @GetMapping("/")
    public String getUsers(Model model){
        model.addAttribute("users", userService.getUsers());
        return "users";
    }

    @GetMapping("/{id}")
    public String user(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "user";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute User user) {
        return "newUser";
    }

    @PostMapping("/new")
    public String createUser(@ModelAttribute User user) {
        userService.add(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/update")
    public String updateUser(@PathVariable int id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "updateUser";
    }

    @PostMapping("/{id}/update")
    public String update(@ModelAttribute User user, @PathVariable int id) {
        userService.update(user, id);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable int id, Model model) {
        userService.delete(id);
        return "redirect:/";
    }
}
