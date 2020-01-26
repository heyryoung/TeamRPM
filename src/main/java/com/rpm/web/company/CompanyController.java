package com.rpm.web.company;

        import ch.qos.logback.core.net.SyslogOutputStream;
        import com.rpm.web.contents.Cars;
        import com.rpm.web.contents.CarsRepository;
        import com.rpm.web.employee.EmployeeInit;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins = "http://localhost:8081")
public class CompanyController {
    @Autowired
    CarsRepository carsRepository;

    @GetMapping("/carList")
    public Map<String, List<Cars>> carList(){
        System.out.println("들어옴");
        Map<String,List<Cars>> map = new HashMap();
        map.put("result",carsRepository.findByCenterCode("114"));
        return map;
    }
    @GetMapping("/customerList")
    public Map<String, String> customerList(){
        System.out.println("들어옴");
        Map<String,String> map = new HashMap();
        map.put("result","aa");
        return map;
    }
}
