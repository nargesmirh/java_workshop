package com.company.model.Officer;

import com.company.model.Driver.DriverEntity;
import com.company.model.Driver.DriverRepository;
import com.company.model.Driver.DriverService;

import java.util.ArrayList;
import java.util.List;

public class OfficerService {
    String code,password;
    private OfficerService() {}
    private static OfficerService officerService=new OfficerService();
    public static OfficerService getInstance() {
        return officerService;
    }
    public void save(OfficerEntity officerEntity) throws Exception {
        try (OfficerRepository officerRepository=new OfficerRepository()) {
            officerRepository.update(officerEntity);
            officerRepository.commit();
        }
    }
    public void save1(OfficerEntity officerEntity)throws Exception {
        try (OfficerRepository officerRepository=new OfficerRepository()) {
            officerRepository.update1(officerEntity);
            officerRepository.commit();
        }
    }
    public List<OfficerEntity> report(OfficerEntity officerEntity) throws Exception {
        List<OfficerEntity> officerEntityList=new ArrayList<>();
        try (OfficerRepository officerRepository=new OfficerRepository()) {
            officerEntityList = officerRepository.report(officerEntity);
        }
        return officerEntityList;
    }
    public String select(String plague , String name) throws Exception {
        List<OfficerEntity> officerEntityList1=new ArrayList<>();
        String result;
        try (OfficerRepository officerRepository = new OfficerRepository()) {
           result = officerRepository.select(plague , name);
        }
        return result;
    }
    public boolean select1(OfficerEntity officerEntity) throws Exception {
        boolean result = false;
        List<OfficerEntity> officerEntityList2=new ArrayList<>();
        try (OfficerRepository officerRepository = new OfficerRepository()) {
             result = officerRepository.select1( officerEntity);
        }
        return result;
    }
    public String select2(String plague , String name) throws Exception {
        List<OfficerEntity> officerEntityList3=new ArrayList<>();
        String result;
        try (OfficerRepository officerRepository = new OfficerRepository()) {
            result= officerRepository.select2(plague , name);
        }
        return result;
    }

    public String selectPlague(String plague) throws Exception {
        List<OfficerEntity> officerEntityList1=new ArrayList<>();
        String result;
        try (OfficerRepository officerRepository = new OfficerRepository()) {
            result = officerRepository.selectPlague(plague );
        }
        return result;
    }

}
