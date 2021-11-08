package com.second.guara.controller;

import com.second.guara.entity.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Controller
@RequestMapping("/test")
public class testController {
    @GetMapping("/test")
    public Object test(String a,String b){
        Map<String, Object> map = new HashMap<>(2);
        map.put("string",a);
        map.put("test",new Test(b));
        return map;
    }
}
