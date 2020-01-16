package com.rpm.web.company;

        import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.HashMap;
        import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CompanyController {
    @GetMapping("/carList")
    public Map<String,String> carList(){
        System.out.println("들어옴");
        Map<String,String> map = new HashMap();
        map.put("result","success");
        return map;
    }
}
