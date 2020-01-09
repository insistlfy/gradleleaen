package com.my.strategy;

import org.springframework.stereotype.Component;

/**
 * StrategyA
 *
 * @author lfy
 * @date 19-12-26
 **/
@Component
public class StrategyA implements Strategy {
    @Override
    public String print(String str) {
        return "A";
    }
}
