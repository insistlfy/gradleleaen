package com.my.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * SimpleContext
 *
 * @author lfy
 * @date 19-12-26
 **/

@Component
public class SimpleContext {

    @Autowired
    private final Map<String, Strategy> strategyMap = new ConcurrentHashMap<>();


    public String getResource(String string) {
        return strategyMap.get(string).print(string);
    }
}
