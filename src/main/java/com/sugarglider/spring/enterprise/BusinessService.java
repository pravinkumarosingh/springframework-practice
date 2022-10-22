package com.sugarglider.spring.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;

@Component
public class BusinessService {
    @Autowired
    private DataService dataService;

    public BusinessService(DataService dataService){
        this.dataService = dataService;
    }
    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
