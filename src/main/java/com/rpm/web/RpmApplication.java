package com.rpm.web;

import com.rpm.web.util.MakeCarDummyList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpmApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RpmApplication.class, args);


/*        MakeCarDummyList http = new MakeCarDummyList();
        System.out.println("POST로 데이터 가져오기");
        http.sendPost("https://www.kcar.com/search/api/getCarSearchWithCondition.do");*/

    }

}
