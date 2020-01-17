package com.rpm.web.company;

        import com.rpm.web.contents.Cars;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.ApplicationArguments;
        import org.springframework.boot.ApplicationRunner;

public class CompanyInit implements ApplicationRunner {
    @Autowired CompanyRepository companyRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
