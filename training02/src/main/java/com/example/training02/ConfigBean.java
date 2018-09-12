package com.example.training02;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author weberliu
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/9/12 15:54
 */
@ConfigurationProperties(prefix = "com")
public class ConfigBean {

    private String name;

    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
