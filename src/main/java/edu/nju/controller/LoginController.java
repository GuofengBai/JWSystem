package edu.nju.controller;

import edu.nju.vo.onlineUserVO;
import edu.nju.vo.userVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/6/12.
 */
@Controller
@SessionAttributes(types = {onlineUserVO.class})
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLoginPage(ModelMap model) {
        return new ModelAndView("login", "user", new userVO());
    }

    //假的登录= =
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView handleLoginRequest(ModelMap model, String username, String password, HttpServletRequest request, HttpSession session) {
        session.setAttribute("username", username);
        return new ModelAndView("redirect:/home");
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView showHomePage(Model model, HttpServletRequest request) {
        /**
         * TODO
         */
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView showAdminPage(Model model, HttpServletRequest request) {
        /**
         * TODO
         */
        return new ModelAndView("admin");
    }

    @RequestMapping(value = "/elective/{username}/{courseid}", method = RequestMethod.POST)
    public ModelAndView elective(ModelMap model, @PathVariable("username") String username, @PathVariable("courseid") String courseid, HttpServletRequest request) {
        /**
         * TODO
         */
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/deleteElective/{username}/{courseid}", method = RequestMethod.POST)
    public ModelAndView deleteElective(ModelMap model, @PathVariable("username") String username, @PathVariable("courseid") String courseid, HttpServletRequest request) {
        /**
         * TODO
         */
        return new ModelAndView("home");
    }
}
