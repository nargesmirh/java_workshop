package com.company.controller;

import com.company.model.Driver.DriverEntity;
import com.company.model.Driver.DriverService;
import com.company.model.Officer.OfficerEntity;

import java.util.ArrayList;
import java.util.List;

public class DriverController {
    public String nump;
//    public List<DriverEntity> Driverselect(){
//        List<DriverEntity> driverEntityList = new ArrayList<>();
//        try {
//            driverEntityList=DriverService.getInstance().select(new DriverEntity().setNumberOfPlaque(nump));
//        }
//        catch(Exception e){
//            e.getMessage();
//        }
//        return driverEntityList;
//    }
    public Boolean Driverreport(String plague){
        boolean result = false;
        try {
            result =DriverService.getInstance().report(plague);
            }
        catch(Exception e){
            e.getMessage();
        }
        return result;
    }
}
