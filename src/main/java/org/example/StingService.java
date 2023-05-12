package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@SuperAnnotation(value = "/super")
public class StingService {
    @SuperAnnotation(value = " 111111 ")
    private String name;
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("МАРКО");
        list.add("ПОЛО");
        return list;

    }


}


