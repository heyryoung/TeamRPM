package com.rpm.web.company;

        import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.HashMap;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CompanyController {
    @GetMapping("/carList")
    public HashMap<String,String> carList(){
        System.out.println("들어옴");
        HashMap<String,String> map = new HashMap<>();
        map.put("result","success");
        return map;
    }
}
