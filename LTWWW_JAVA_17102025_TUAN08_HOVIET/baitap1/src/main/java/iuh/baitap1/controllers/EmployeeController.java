package iuh.baitap1.controllers;

import iuh.baitap1.entities.Employee;
import iuh.baitap1.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ModelAndView getList(ModelAndView modelAndView) {
        List<Employee> employees = employeeService.findAll();
        modelAndView.addObject("employees", employees);
        modelAndView.setViewName("list");
        return modelAndView;
    }
    @GetMapping("/show-form")
    public ModelAndView showForm(ModelAndView modelAndView) {
        Employee employee = new Employee();
        modelAndView.addObject("employee", employee);
        modelAndView.setViewName("register");
        return modelAndView;
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        employeeService.save(employee);
        return "redirect:/";
    }
    @GetMapping("/update")
    public ModelAndView showFormUpdate(@RequestParam("employeeId") int id, ModelAndView modelAndView) {
        Employee employee = employeeService.findById(id);

        if (employee == null) {
            modelAndView.setViewName("error");
            modelAndView.addObject("errorMessage","Employee not found");
        }else {

            modelAndView.addObject("employee", employee);
            modelAndView.setViewName("register");
        }

        modelAndView.addObject("employee", employee);
        modelAndView.setViewName("register");
        return modelAndView;
    }
}
