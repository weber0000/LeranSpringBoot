package com.example.training03.controller;

import com.example.training03.model.Learn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weberliu
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/9/12 16:26
 */
@RestController("/learn")
public class LearnController {

    @GetMapping
    private ModelAndView learnList(){
        List<Learn> learnList=new ArrayList<>();
        Learn bean =new Learn("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean =new Learn("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean =new Learn("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new Learn("嘟嘟MD独立博客","Spring Boot干货系列 ","http://tengj.top/");
        learnList.add(bean);
        bean =new Learn("后端编程嘟","Spring Boot教程和视频 ","http://www.toutiao.com/m1559096720023553/");
        learnList.add(bean);
        bean =new Learn("程序猿DD","Spring Boot系列","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new Learn("纯洁的微笑","Sping Boot系列文章","http://www.ityouknow.com/spring-boot");
        learnList.add(bean);
        bean =new Learn("CSDN——小当博客专栏","Sping Boot学习","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new Learn("梁桂钊的博客","Spring Boot 揭秘与实战","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new Learn("林祥纤博客系列","从零开始学Spring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        learnList.add(bean);
        ModelAndView modelAndView=new ModelAndView("/index");
        modelAndView.addObject("learnList",learnList);
        return modelAndView;

    }

}
