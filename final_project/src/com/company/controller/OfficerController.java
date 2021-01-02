package com.company.controller;

import com.company.model.Officer.OfficerEntity;
import com.company.model.Officer.OfficerService;

import java.util.ArrayList;
import java.util.List;

public class OfficerController {
    public String code,password;
    public String Plaque ,name,dates,times,point,violation,description;
    public long amountfines;
    public List<OfficerEntity> Officerreport() {
        List<OfficerEntity> officerEntityList = new ArrayList<>();
        try {
            officerEntityList=OfficerService.getInstance().report( new OfficerEntity ().setOfficerCode(code).setPasswordOfficer(password));
        }
        catch (Exception e) {
            e.getMessage();

        }
        return officerEntityList;
    }
    //violation
    public void Officersave(){
        try {
            OfficerService.getInstance().save(new OfficerEntity().setOfficerName(name).setTimes(times).setDates(dates)
                    .setNumberOfPlaque(Plaque).setNegativePoint(point).setTheAmountOfFines(amountfines)
                    .setRecordViolations(violation));
        }
        catch (Exception e){
            e.getMessage();
        }
    }
    //description
    public void Officersave1(){
        try {
            OfficerService.getInstance().save(new OfficerEntity().setOfficerName(name).setTimes(times).setDates(dates)
                    .setDescriptionOftheAccident(description).setNumberOfPlaque(Plaque));
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public String select(String plague , String name){
       List<OfficerEntity> officerEntities=new ArrayList<>();
       String result = "";

        try {
            result =OfficerService.getInstance().select(plague , name);
        }
        catch (Exception e){
            e.getMessage();
        }
        return result;
    }
    public boolean select1(OfficerEntity officerEntity){
        boolean result = false;
        List<OfficerEntity> officerEntities1=new ArrayList<>();

        try {
         result =OfficerService.getInstance().select1( officerEntity);
        }
        catch (Exception e){
            e.getMessage();
        }
        return result;
    }
    public String  select2(String plague , String name){
        String result= "";
        try {
            result =OfficerService.getInstance().select2(plague, name);

        }
        catch (Exception e){
            e.getMessage();
        }
        System.out.println(result);
        return result;
    }

    public String selectPlague(String plague){
        List<OfficerEntity> officerEntities=new ArrayList<>();
        String result = "";

        try {
            result =OfficerService.getInstance().selectPlague(plague );
        }
        catch (Exception e){
            e.getMessage();
        }
        return result;
    }

}
