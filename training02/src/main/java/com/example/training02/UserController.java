package com.example.training02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weberliu
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/9/12 15:52
 */
@RestController
public class UserController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/")
    private String index(){
        return configBean.getName()+configBean.getWant();
    }
}
