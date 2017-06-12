package edu.nju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/6/12.
 */
@Controller
public class StudentController {
    @RequestMapping(value = "/home/{username}", method = RequestMethod.GET)
    public ModelAndView showHomePage(Model model, HttpServletRequest request) {
        return new ModelAndView("home");
    }
}
