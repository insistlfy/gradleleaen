package com.my.threadpool.task;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * BasicTask
 *
 * @author lfy
 * @date 19-12-27
 **/
@Slf4j
@Component
@ApiModel
public class BasicTask {

    @Async
    @ApiOperation("每天凌晨一点执行")
    @Scheduled(cron = "0 0 1 * * ?")
    public void test01() {
        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskA");
    }

    @Async
    @Scheduled(cron = "0 0 1 * * ?")
    @ApiOperation("每天凌晨一点执行")
    public void test02() {
        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskB");
    }

//    @Async
//    @Scheduled(cron = "*/5 * * * * ?")
//    public void test03() {
//        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskC");
//    }
//
//    @Async
//    @Scheduled(cron = "*/5 * * * * ?")
//    public void test04() {
//        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskD");
//    }
//
//    @Async
//    @Scheduled(cron = "*/5 * * * * ?")
//    public void test05() {
//        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskE");
//    }
}
