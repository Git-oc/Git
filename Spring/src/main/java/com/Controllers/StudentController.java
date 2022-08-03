package com.Controllers;

import com.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("student")
public class StudentController {

    @RequestMapping("add")
    public ModelAndView addStudent(String stuName, String stuGender, Integer stuAge, Date stuTime){

        System.out.println(stuName+"\t"+stuGender+"\t"+stuAge+"\t"+stuTime);

        ModelAndView modelAndView = new ModelAndView("/tips");
        modelAndView.addObject("key","value");
        modelAndView.addObject("student",new Student("夏明","女",18));

        return modelAndView;
    }

}
