package com.my.test.controller;

import com.my.strategy.SimpleContext;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author lfy
 * @date 19-11-25
 **/
@Api(tags = "Test")
@RestController
public class TestController {

    @Autowired
    private SimpleContext simpleContext;

    @GetMapping("/hello")
    @ApiOperation(value = "test001")
    public String helloGradle() {
        return "Hello Gradle";
    }

    @GetMapping("/strategy")
    @ApiOperation(value = "strategy")
    public String helloStrategy() {
        return simpleContext.getResource("strategyA");
    }
}
