package co.uk.endava.controller;

import co.uk.endava.model.User;
import co.uk.endava.model.UserValidation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by nilies on 7/14/2016.
 */

@Controller
public class LoginController {
    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public ModelAndView showAddUserForm(Model model) {
        User user = new User();
        return new ModelAndView("Login","userForm",user);
    }

    @RequestMapping(value = "/success", method = RequestMethod.POST)
    public String saveOrUpdateUser(@ModelAttribute("userForm") User user, BindingResult result, Model model)
    {
        UserValidation uv = new UserValidation(user);
        if (uv.validate()) {
            model.addAttribute("username", user.getUsername());
            model.addAttribute("password", user.getPassword());
            model.addAttribute("age", user.getAge());
            return "success";
        }
        else return "rip";
    }



}
