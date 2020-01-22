package com.rpm.web.employee;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeInit implements ApplicationRunner {
    private EmployeeRepository employeeRepository;

    public EmployeeInit(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = employeeRepository.count();
        String[] code={"010",""};
        if (count == 0) {
            // Jsoup를 이용해서 http://www.cgv.co.kr/movies/ 크롤링
            String url = "https://www.kcar.com/directcenter/directcenter_detail.do?i_sCenterCode=114"; //크롤링할 url지정
            Document doc = null;        //Document에는 페이지의 전체 소스가 저장된다

            try {
                doc = Jsoup.connect(url).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //select를 이용하여 원하는 태그를 선택한다. select는 원하는 값을 가져오기 위한 중요한 기능이다.
            Elements element = doc.select("span.employee_name");
            Elements element2 = doc.select("span.employee_txt");
            Elements element3 = doc.select("span.img>img");
            Elements element4 = doc.select("h3.center_name");

            System.out.println("============================================================");

            //Iterator을 사용하여 하나씩 값 가져오기
            Iterator<Element> ie1 = element.iterator();
            Iterator<Element> ie2 = element2.iterator();
            Iterator<Element> ie3 = element3.iterator();
            int i = 0;
            int j=0;
            for (;j<element.size()/2;j++) {
                i++;
                Employee employee = new Employee();
                employee.setEmCode(i);
                employee.setCenterName(element4.text());
                employee.setEmName(ie1.next().text());
                employee.setEmPosition(ie2.next().text());
                employee.setEmImg(ie3.next().attr("src"));
                System.out.println(employee.toString());
                employeeRepository.save(employee);


            }

            System.out.println("============================================================");
        }
    }
}