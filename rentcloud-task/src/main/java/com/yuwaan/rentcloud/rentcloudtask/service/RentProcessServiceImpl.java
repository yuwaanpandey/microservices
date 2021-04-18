package com.yuwaan.rentcloud.rentcloudtask.service;

import org.springframework.stereotype.Service;

@Service
public class RentProcessServiceImpl implements RentProcessService {


    @Override
    public boolean validateDL(String dl) {
        return dl.length() >= 5;
    }


}
