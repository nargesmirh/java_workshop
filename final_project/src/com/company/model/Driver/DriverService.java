package com.company.model.Driver;

import java.util.List;

public class DriverService {
      private DriverService() {}
      private static DriverService driverService = new DriverService();
      public static DriverService getInstance() {
          return driverService;
      }
//    public List<DriverEntity> select(DriverEntity driverEntity) throws Exception {
//        List<DriverEntity> driverEntityList;
//        try (DriverRepository driverRepository=new DriverRepository()) {
//            driverEntityList = driverRepository.select(driverEntity);
//        }
//        return driverEntityList;
//    }
        public boolean report(String plague) throws Exception {
            List<DriverEntity> driverEntityList;
            boolean result;
            try (DriverRepository driverRepository=new DriverRepository()) {
                result = driverRepository.report(plague);
            }
            return result;
        }
}
