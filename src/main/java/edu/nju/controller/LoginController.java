package edu.nju.controller;

import edu.nju.service.CourseService;
import edu.nju.service.SelectService;
import edu.nju.service.StudentService;
import edu.nju.util.UtilTool;
import edu.nju.vo.CourseVO;
import edu.nju.vo.SelectVO;
import edu.nju.vo.StudentVO;
import edu.nju.vo.userVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */
@Controller

public class LoginController {
    @Autowired
    CourseService courseService;
    @Autowired
    SelectService selectService;
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLoginPage(ModelMap model) {
        UtilTool.init();
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

        String username = (String) request.getSession().getAttribute("username");
        List<CourseVO> course1 = courseService.getSelectedCourse(username);
        model.addAttribute("courseSelected", course1);
        List<CourseVO> course2 = courseService.getUnSelectedCourse(username);
        model.addAttribute("courseUnSelected", course2);
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView showAdminPage(Model model, HttpServletRequest request) {
        List<CourseVO> course = courseService.getAllCourse();
        model.addAttribute("courseVO", course);
        List<SelectVO> select = selectService.getAllSelect();
        model.addAttribute("ElectiveVO", select);
        List<StudentVO> student = studentService.GetAllStudents();
        model.addAttribute("StudentVO", student);
        return new ModelAndView("admin");
    }

    @RequestMapping(value = "/elective/{username}/{courseid}", method = RequestMethod.GET)
    public ModelAndView elective(ModelMap model, @PathVariable("username") String username, @PathVariable("courseid") String courseid, HttpServletRequest request) {
        SelectVO vo = new SelectVO(courseid, username);
        selectService.select(vo);
        return new ModelAndView("redirect:/home");
    }

    @RequestMapping(value = "/deleteElective/{username}/{courseid}", method = RequestMethod.GET)
    public ModelAndView deleteElective(ModelMap model, @PathVariable("username") String username, @PathVariable("courseid") String courseid, HttpServletRequest request) {
        SelectVO vo = new SelectVO(courseid, username);
        selectService.drop(vo);
        return new ModelAndView("redirect:/home");
    }
}
