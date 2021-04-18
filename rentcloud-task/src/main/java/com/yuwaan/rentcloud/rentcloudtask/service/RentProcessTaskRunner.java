package com.yuwaan.rentcloud.rentcloudtask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class RentProcessTaskRunner implements CommandLineRunner {

    @Autowired
    RentProcessService rentProcessService;


    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0) {
            System.out.println("task running with arguments");
            if (rentProcessService.validateDL(args[0])) {
                System.out.println("its a valid dl");
            } else {
                System.out.println("Its not a valid dl");
            }
        } else {
            System.out.println("Task running without any arguments");
        }

    }
}
