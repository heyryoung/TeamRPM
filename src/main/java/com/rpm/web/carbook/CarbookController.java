package com.rpm.web.carbook;

import com.rpm.web.user.User;
import com.rpm.web.util.Printer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CarbookController {
    @Autowired
    Printer printer;
    @Autowired CarbookRepository carbookRepository;
    @Autowired Carbook carbook;
    @Autowired Record record;
    @Autowired RecordRepository recordRepository;

    @Autowired
    ModelMapper modelMapper;
    @Bean public ModelMapper modelMapper(){return new ModelMapper();}


    @PostMapping("/getMycar")
    public HashMap<String, Object> getMycar(@RequestBody User param){
        printer.accept("in the carbookCon");
        HashMap<String, Object> map = new HashMap<>();
        carbook = carbookRepository.findBySeq(param.getUserSeq());
        printer.accept(carbook.toString());

        if(carbook != null){
            map.put("result" , "success");
            map.put("mycar" , carbook);
            Iterable<Record> itRecord =  recordRepository.findbyMycarId(carbook.getMycarId());
            List<Record> records = new ArrayList<>();
            if(itRecord !=null){
                for(Record r: itRecord){
                    Record bean = modelMapper.map(r, Record.class);
                    records.add(bean);
                    printer.accept("in the carbook.for");

                }
                map.put("record", records);

            }
            return map;


        }
        map.put("result", "fail");
        return map;

    }
    @PostMapping("/getRecord")
    public HashMap<String, Object> getRecord(@RequestBody Carbook param){
        printer.accept("in the getrecord");
        HashMap<String, Object> map = new HashMap<>();
        printer.accept(String.valueOf(param.getMycarId()));
        Iterable<Record> records = recordRepository.findbyMycarId(param.getMycarId());

        List<Record> list = new ArrayList<>();
        for(Record r : records){
            Record bean = modelMapper.map(r, Record.class);
            list.add(bean);

        }


        //printer.accept(carbook.toString());

        if(list != null){
            map.put("result" , "success");
            map.put("record" , list);
            return map;


        }
        map.put("result", "fail");
        return map;
    }
    @PostMapping("/insertRecord")
    public HashMap<String, Object> addRecord(@RequestBody Record param){
        HashMap<String, Object> map = new HashMap<>();
        //printer.accept(String.valueOf(param.getMycarId()));
        record = recordRepository.save(param);
        if(record != null){
            map.put("rec", record);
            map.put("result" , "success");
        }
        else{
            map.put("result" , "fail");

        }
        return map;
    }
    @GetMapping("/deleteRecord")
    public HashMap<String, Object> delRecord(@PathVariable String recoId){

        HashMap<String, Object> map = new HashMap<>();
        long id = Long.parseLong(recoId);
        recordRepository.deleteRecordByRecordId(id);
        map.put("delete", "success");
        return map;

    }



}
