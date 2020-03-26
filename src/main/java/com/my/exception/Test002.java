package com.my.exception;

import lombok.extern.slf4j.Slf4j;

/**
 * Test002
 * TIP : e.printStackTrace() 会导致锁死  禁止使用 ,使用log日志代替
 *
 * @author lfy
 * @date 2020/3/26
 **/
@Slf4j
public class Test002 {

    public static void main(String[] args) {

        try {

            int i = 1 / 0;
        } catch (Exception e) {
//            e.printStackTrace();
//            log.error(e.toString());
            log.error("ERROR================>", e);
        }
    }
}
