package edu.nju.controller;

import edu.nju.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<String> json() {
        return userService.getAllUsernames();
    }
}

