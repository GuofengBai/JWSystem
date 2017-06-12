package edu.nju.controller;

import edu.nju.vo.userVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/6/12.
 */
@Controller
@SessionAttributes(types = {userVO.class})
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLoginPage(ModelMap model) {
        return new ModelAndView("login", "user", new userVO());
    }

    //假的登录= =
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView handleLoginRequest(ModelMap model, HttpServletRequest request) {

        return new ModelAndView("redirect:/home/");
    }
}
