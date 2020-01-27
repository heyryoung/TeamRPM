package com.rpm.web.company;

import com.rpm.web.employee.EmployeeRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CompanyInit implements ApplicationRunner {
    private CompanyRepository companyRepository;

    public CompanyInit(CompanyRepository companyRepository) {
        this.companyRepository= companyRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = companyRepository.count();
        List<String> code= companyRepository.findByCenterCode();
        List<String> centerName =  companyRepository.findByCenterRegion("서울");
        System.out.println(centerName);
        code.forEach(el->{

            if (count == 0) {
                Company company= new Company();
                company.setCenterCode(el);
                company.setCenterName(companyRepository.findByCenterCode(el));
                company.setCenterRegion(companyRepository.findByCenterCode2(el));
                companyRepository.save(company);
            }
        });
    }

}