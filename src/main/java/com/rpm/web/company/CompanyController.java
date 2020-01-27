package com.rpm.web.company;

        import ch.qos.logback.core.net.SyslogOutputStream;
        import com.rpm.web.contents.Cars;
        import com.rpm.web.contents.CarsRepository;
        import com.rpm.web.employee.EmployeeInit;
        import com.rpm.web.recommend.Recommend;
        import com.rpm.web.recommend.RecommendRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins = "http://localhost:8081")
public class CompanyController {
    @Autowired
    CarsRepository carsRepository;
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    RecommendRepository recommendRepository;

    @GetMapping("/carList")
    public Map<String, List<Cars>> carList(){
        Map<String,List<Cars>> map = new HashMap();
        map.put("result",carsRepository.findByCenterCode("114"));
        return map;
    }
    @GetMapping("/customerList")
    public Map<String, String> customerList(){
        Map<String,String> map = new HashMap();
        map.put("result","aa");
        return map;

    }

}
