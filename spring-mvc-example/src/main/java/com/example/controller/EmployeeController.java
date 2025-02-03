package com.example.controller;

import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeController() {
        // Mock data
        employeeList.add(new Employee(1, "John Doe", "Engineering"));
        employeeList.add(new Employee(2, "Jane Smith", "Marketing"));
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeList);
        return "employeeList";
    }

    @GetMapping("/addEmployee")
    public String addEmployeeForm() {
        return "addEmployee";
    }

    @GetMapping("/addEmployeeSubmit")
    public String addEmployee(@RequestParam String name, @RequestParam String department, Model model) {
        int newId = employeeList.size() + 1;
        employeeList.add(new Employee(newId, name, department));
        model.addAttribute("message", "Employee " + name + " added successfully!");
        return "success";
    }
}
