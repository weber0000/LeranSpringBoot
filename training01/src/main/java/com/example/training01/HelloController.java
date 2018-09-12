package com.example.training01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author weberliu
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/9/12 14:45
 */
@RestController
public class HelloController {

    @Value("${com.name}")
    private String name;

    @Value("${com.age}")
    private String age;

    @RequestMapping("/")
    public  String index(){

        return name+"hello world!!!";

    }
}
