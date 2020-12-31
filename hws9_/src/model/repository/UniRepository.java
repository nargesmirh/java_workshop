package model.repository;

import model.entity.unientity;

import java.sql.*;
import java.util.*;

public class UniRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UniRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","zareii","myjava123");
        connection.setAutoCommit(false);
    }

    public void insert(unientity unientity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into cours(name,code,capacity,unit) values (?,?,?,?,?)");
        preparedStatement.setString(1, unientity.getName());
        preparedStatement.setInt(2, unientity.getCode());
        preparedStatement.setString(3, unientity.getCapacity());
        preparedStatement.setInt(4, unientity.getUnit());

        preparedStatement.executeUpdate();
    }

    public void update(unientity unientity) throws Exception {
        preparedStatement = connection.prepareStatement("update cours set name = ?, capacity = ?, unit = ?,  where code = ?");
        preparedStatement.setString(1, unientity.getName());
        preparedStatement.setString(2, unientity.getCapacity());
        preparedStatement.setInt(3, unientity.getUnit());
        preparedStatement.setInt(5, unientity.getCode());
        preparedStatement.executeUpdate();
    }

    public void delete(int code) throws Exception {
        preparedStatement = connection.prepareStatement("delete from cours where code = ? ");
        preparedStatement.setInt(1,code);
        preparedStatement.executeUpdate();
    }

    public List<unientity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from cours");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<unientity> unientityList = new ArrayList<>();
        while(resultSet.next()) {
            unientity unientity = new unientity();
            unientity.setName(resultSet.getString("Name"));
            unientity.setCode(resultSet.getInt("Code")) ;
            unientity.setcapacity(resultSet.getString("capacity"));
            unientity.setunit(resultSet.getInt("unit"));

            unientityList.add(unientity);
        }
        return unientityList;
    }

    public void commit() throws Exception {
        connection.commit();
    }

    public void rollback() throws Exception {
        connection.rollback();
    }

    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
