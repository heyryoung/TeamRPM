package com.rpm.web.contents;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rpm.web.util.MakeCarDummyList;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class CarsInit implements ApplicationRunner {
    private CarsRepository carsRepository;

    public CarsInit(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = carsRepository.count();
        MakeCarDummyList http = new MakeCarDummyList();
        ObjectMapper jsonMapper = new ObjectMapper();
        String[] json = null;
        Map<String, Map<String, Object>> map = new HashMap<>();
        if(count==0) {
            System.out.println("POST로 데이터 가져오기");
            for (int i = 1; i <= 8000;i++){
                Map<String, String> strJson = new HashMap<>();
                 map = jsonMapper.readValue(
                        http.sendPost("https://www.kcar.com/search/api/getCarSearchWithCondition.do", String.valueOf(i))
                                .replace("=", ":"), Map.class);
                json = map.get("result").get("rows").toString()
                        .replace("[{", "").replace("}]", "").split(",");
                for (int j = 0; j < json.length; j++){
                    if(json[j].indexOf("=")+1>=1){
                        System.out.println(json[j].substring(0,json[j].indexOf("=")).trim());
                        System.out.println(json[j].substring(json[j].indexOf("=")+1));
                        strJson.put(json[j].substring(0,json[j].indexOf("=")).trim(),json[j].substring(json[j].indexOf("=")+1));
                    }
                }
                carsRepository.save(new Cars(strJson.get("v_carcd"),
                        strJson.get("v_optioncd"),strJson.get("v_categorycd"),strJson.get("v_center_code"),
                        strJson.get("v_middle_img"),strJson.get("v_elan_path"),strJson.get("v_exterior_colorcd"),
                        strJson.get("v_center_region"),strJson.get("v_ecc_reg_dtm"),strJson.get("v_begin_year"),
                        strJson.get("v_makecd"),strJson.get("v_small_img"),strJson.get("v_modelnm"),
                        strJson.get("v_optioncd_name"),strJson.get("v_car_type"),strJson.get("v_pn_mobile"),
                        strJson.get("v_usernm"),strJson.get("n_mileage"),strJson.get("v_simple_comment"),
                        strJson.get("v_modelnm_text"),strJson.get("v_transmissioncd"),strJson.get("v_car_number"),
                        strJson.get("n_price"),strJson.get("v_fuel_typecd_name"),strJson.get("v_car_url"),
                        strJson.get("v_fuel_typecd"),strJson.get("v_center_region_code"),strJson.get("v_truck_name"),
                        strJson.get("v_categorynm"),strJson.get("v_exterior_colornm"),strJson.get("v_hot_markcd"),
                        strJson.get("v_transmissioncd_name"),strJson.get("n_pass_cnt"),strJson.get("v_modelcd"),
                        strJson.get("v_rec_comment_cd"),strJson.get("v_makenm"),strJson.get("v_pn"),
                        strJson.get("v_mfr_date"),strJson.get("v_model_grp_cd"),strJson.get("v_center_name"),
                        strJson.get("v_model_grp_nm")
                        ));

            }
            System.out.println("데이터 가져오기 종료.");
        }
    }
}
