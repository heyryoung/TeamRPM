package com.rpm.web.revenue;

import com.rpm.web.employee.Employee;
import com.rpm.web.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RevenueInit implements ApplicationRunner {
    @Autowired
    private RevenueRepository revenueRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = revenueRepository.count();

        if (count == 0) {

            employeeRepository.findEmCode().forEach(el->{
                for(int i =1; i<13; i++) {
                    Revenue revenue =new Revenue();
                    revenue.setMonth(String.valueOf(i));
                    revenue.setEmCode(el);
                   // revenue.setCenterCode(employeeRepository.findByEmCode(el));
                    revenue.setEmRevenue((int)(Math.random()*100+1)*1000);
                    revenueRepository.save(revenue);
                }
            });

        }
    }
}