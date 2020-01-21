package com.rpm.web.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:8081")
public class EmployeeController {
    @Autowired EmployeeRepository employeeRepository;

    @GetMapping("/employeeList")
    public Map<String, List<Employee>> employeeList(){
        Map<String,List<Employee>> map =new HashMap<>();
        map.put("result",employeeRepository.findByCenterName("청주직영점"));
        return map;
    }
}
