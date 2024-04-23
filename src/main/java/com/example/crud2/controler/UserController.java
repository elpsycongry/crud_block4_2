package com.example.crud2.controler;

import com.example.crud2.model.User;
import com.example.crud2.service.ClassroomService;
import com.example.crud2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public ModelAndView index(
            @RequestParam(value = "search", required = false) String search,
            @RequestParam(value = "pageNum", required = false, defaultValue = "5") Integer pageNum,
            @RequestParam(value = "currentPage", required = false, defaultValue = "0") Integer currentPage,
            @RequestParam(value = "sortBy", required = false, defaultValue = "id") String sortBy,
            @RequestParam(value = "direction", required = false, defaultValue = "asc") String direction
    ) {
        ModelAndView home = new ModelAndView("/home");
        Pageable pageable = PageRequest.of(currentPage, pageNum);
        Page<User> users = userService.getUserRepo().findAll(pageable);
        home.addObject("users", users);
        return home;
    }
    @PostMapping("/directToHome")
    public String directToHome() {
        return "redirect:/users";
    }
}
