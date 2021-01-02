package com.company.model.Officer;

import com.company.model.Officer.OfficerEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfficerRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public OfficerRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mirh", "narges1380");
        connection.setAutoCommit(false);
    }
    public List<String> code=new ArrayList<>();
    public List<String> pass=new  ArrayList<>();
    //insert sabt takhalof
    public void update(OfficerEntity officerEntity) throws Exception {
        preparedStatement=connection.prepareStatement("update Officer set(dates=?,times=?,recordViolations=?,negativePoint=?,theAmountOfFines=?) where numberOfPlaque=? and officerName=?");
        preparedStatement.setString(7,officerEntity.getOfficerName());
        preparedStatement.setString(1,officerEntity.getDates());
        preparedStatement.setString(2,officerEntity.getTimes());
        preparedStatement.setString(6,officerEntity.getNumberOfPlaque());
        preparedStatement.setString(3,officerEntity.getRecordViolations());
        preparedStatement.setString(4,officerEntity.getNegativePoint());
        preparedStatement.setLong(5,officerEntity.getTheAmountOfFines());
        preparedStatement.executeUpdate();
    }
    //sabte traffic tasadof
    public void update1(OfficerEntity officerEntity) throws Exception{
        preparedStatement=connection.prepareStatement("update officer set(times=?,dates=?,descriptionOftheAccident=?) where officerName=? and numberOfPlaqu=?");
        preparedStatement.setString(4,officerEntity.getOfficerName());
        preparedStatement.setString(2,officerEntity.getDates());
        preparedStatement.setString(1,officerEntity.getTimes());
        preparedStatement.setString(3,officerEntity.getDescriptionOftheAccident());
        preparedStatement.setString(5,officerEntity.getNumberOfPlaque());

        preparedStatement.executeUpdate();
    }
    public List<OfficerEntity> report(OfficerEntity officerEntity) throws Exception{

        preparedStatement=connection.prepareStatement("select * from officer where officerCode=? and passwordOfficer=?");
        preparedStatement.setString(1,officerEntity.getOfficerCode());
        preparedStatement.setString(2,officerEntity.getPasswordOfficer());
        ResultSet resultSet = preparedStatement.executeQuery();
        List<OfficerEntity> officerEntities= new ArrayList<>();
        while(resultSet.next()){
            OfficerEntity entity=new OfficerEntity();
            entity.setOfficerCode(resultSet.getString("officerCode"));
            entity.setOfficerName(resultSet.getString("officerName"));
            entity.setCarOwnerName(resultSet.getString("carOwnerName"));
            entity.setCertificateNumber(resultSet.getString("CertificatedNumber"));
            entity.setInsuranceNumber(resultSet.getString("InsuranceNumber"));
            entity.setNumberOfPlaque(resultSet.getString("NumberOfPlaque"));
            entity.setNumberOfCardmachine(resultSet.getString("NumberOfCardmachine"));
            entity.setPasswordOfficer(resultSet.getString("PasswordOfficer"));
            officerEntities.add(entity);
        }
        return officerEntities;

    }
    //
    public String select(String plague , String name) throws Exception{
        preparedStatement=connection.prepareStatement("select * from officer WHERE NumberOfPlaque=? and OfficerName=?");
        preparedStatement.setString(1,plague);
        preparedStatement.setString(2,name);
        ResultSet resultSet1 = preparedStatement.executeQuery();
        List<OfficerEntity> officerEntities1= new ArrayList<>();
        if (resultSet1.next()){
            return "NegativePoint = " + resultSet1.getNString("NegativePoint") +
                    " \t \t \t RecordViolations = " + resultSet1.getNString("RecordViolations") +
                    "\t \t \tTheAmountOfFines = " + resultSet1.getLong("TheAmountOfFines");
        }
        return " ";
    }
    public boolean select1(OfficerEntity officerEntity) throws Exception{
        preparedStatement=connection.prepareStatement("select OfficerCode ,PasswordOfficer from officer where OfficerCode=? and PasswordOfficer=?");
        preparedStatement.setString(1,officerEntity.getOfficerCode());
        preparedStatement.setString(2,officerEntity.getPasswordOfficer());
        ResultSet resultSet2 = preparedStatement.executeQuery();
        List<OfficerEntity> officerEntities2= new ArrayList<>();
        if (resultSet2.next())
        {

            return true;

        }
        return false;


    }
    public String select2(String plague , String name) throws Exception{
        preparedStatement=connection.prepareStatement("select * from officer WHERE NumberOfPlaque=? and OfficerName=?");
        preparedStatement.setString(1,plague);
        preparedStatement.setString(2,name);
        ResultSet resultSet2 = preparedStatement.executeQuery();
        if (resultSet2.next()){
            return "Times = " + resultSet2.getString("Times") +
                    " \t \t \t Dates = " + resultSet2.getString("Dates") +
                    "\t \t \t  DescriptionOftheAccident = " + resultSet2.getString("DescriptionOftheAccident");
        }
        return "";

    }
    public  String selectPlague(String plague) throws SQLException {
        preparedStatement=connection.prepareStatement("select * from officer WHERE NumberOfPlaque=? ");
        preparedStatement.setString(1,plague);

        ResultSet resultSet1 = preparedStatement.executeQuery();
        List<OfficerEntity> officerEntities1= new ArrayList<>();
        if (resultSet1.next()){
            return "NegativePoint = " + resultSet1.getNString("NegativePoint") +
                    " \t \t \t RecordViolations = " + resultSet1.getNString("RecordViolations") +
                    "\t \t \tTheAmountOfFines = " + resultSet1.getLong("TheAmountOfFines");
        }
        return " ";
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

}