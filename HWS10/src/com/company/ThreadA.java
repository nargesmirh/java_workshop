package com.company;
import java.io.IOException;
import java.sql.*;
public class ThreadA extends Thread {

    @Override
    public void run() {
        super.run();
        Note note = new Note();
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zareii",
                "myjava123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            /* insert into DB */
            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into NOTE (id,note) values (?,?)");
            preparedStatement1.setLong(1,note.getId());
            preparedStatement1.setString(2, note.getNote());
            preparedStatement1.setLong(1,note.getId());
            preparedStatement1.setString(2, note.getNote());
            preparedStatement1.setLong(1,note.getId());
            preparedStatement1.setString(2, note.getNote());
            System.out.println ("Insert into DB: "+preparedStatement1.executeUpdate());

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

            try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zareii", "myjava123")) {
                Class.forName("oracle.jdbc.OracleDriver");
                PreparedStatement preparedStatement =connection.prepareStatement("select  * from note where id = ?");
                preparedStatement.setLong(1,note.getId());
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    System.out.println("name :" +resultSet.getString("name"));
                    System.out.println("nasher:" +resultSet.getString("nasher"));
    }} catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }}}





