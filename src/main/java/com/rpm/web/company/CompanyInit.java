package com.rpm.web.company;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
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
        List<String> code= companyRepository.findCenterCode();
        List<String> centerName =  companyRepository.findByCenterRegion("서울");
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