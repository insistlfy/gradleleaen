package com.my.threadpool.task;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * BasicTask(同步任务)
 *
 * @author lfy
 * @date 19-12-27
 **/
@Slf4j
@Component
@ApiModel
public class BusiTask {

//    @ApiOperation(value = "每隔一分钟执行")
//    @Scheduled(cron = "0 */1 * * * ?")
//    public void test01() {
//        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskAA");
//    }
//
//    @ApiOperation(value = "每隔五分钟执行")
//    @Scheduled(cron = "0 */5 * * * ?")
//    public void test02() {
//        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskBB");
//    }
//
//    @ApiOperation(value = "每隔五秒执行")
//    @Scheduled(cron = "*/5 * * * * ? ")
//    public void test03() {
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskCC");
//        }
//    }
//
//    @ApiOperation(value = "每隔五秒执行")
//    @Scheduled(cron = "*/5 * * * * ? ")
//    public void test04() {
//        log.info("This Is {}....,Name Is {}.", Thread.currentThread().getName(), "TaskDD");
//    }
}
