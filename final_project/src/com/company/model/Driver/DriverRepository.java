package com.company.model.Driver;

import com.company.model.Officer.OfficerEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DriverRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public DriverRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mirh", "narges1380");
        connection.setAutoCommit(false);

    }
    public Boolean report(String plague) throws Exception{
        preparedStatement=connection.prepareStatement("select NumberOfPlaque  from  Driver  where NumberOfPlaque=?");
        preparedStatement.setString(1,plague);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<DriverEntity> driverEntities= new ArrayList<>();
        if (resultSet.next()){
            return true;

        }
        return false;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();

    }

//    public List<DriverEntity> report() throws Exception{
//        preparedStatement=connection.prepareStatement("select * from Driver ");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        List<DriverEntity> driverEntities= new ArrayList<>();
//        while(resultSet.next()){
//            DriverEntity entity=new DriverEntity();
//            entity.setName(resultSet.getString("Name"));
//            entity.setNumberOfPlaque(resultSet.getString("NumberOfPlaque"));
//            entity.setCertificateNumber(resultSet.getString("CertificateNumber"));
//            entity.setNumberOfCardMechine(resultSet.getString("NumberOfCardMechine"));
//            entity.setInsuranceNumber(resultSet.getString("InsuranceNumber"));
//            entity.setId(resultSet.getString("Id"));
//            driverEntities.add(entity);
//        }
//        return driverEntities;
//    }


}
