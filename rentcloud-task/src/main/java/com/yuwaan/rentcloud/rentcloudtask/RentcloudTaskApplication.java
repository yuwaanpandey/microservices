package com.yuwaan.rentcloud.rentcloudtask;

import com.yuwaan.rentcloud.rentcloudtask.service.RentProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class RentcloudTaskApplication {

    @Bean
    RentProcessTaskRunner getRentProcessTask(){
        return new RentProcessTaskRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(RentcloudTaskApplication.class, args);
    }

}
