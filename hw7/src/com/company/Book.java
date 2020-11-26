package com.company;

import java.sql.*;
import java.util.Scanner;

public class Book {
    Scanner input = new Scanner(System.in);

    public void addbook(Title_book title_book){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zareii", "myjava123")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1= connection.prepareStatement("select * from book where id=?");
            preparedStatement1.setLong(1,title_book.getId());
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                System.out.println("this book is there already!");
            }else {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into book (name,nasher,chap,id,title) values (?,?,?,?,?,?,?)");
                preparedStatement.setLong(1, title_book.getId());
                preparedStatement.setString(2, title_book.getName());
                preparedStatement.setString(3, title_book.getNasher());
                preparedStatement.setString(4, title_book.getChap());
                preparedStatement.setString(5, title_book.getTitle());

                System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
                preparedStatement.close();
            }preparedStatement1.close();
            connection.close();
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void showinfo(Title_book title_book) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zareii", "myjava123")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement =connection.prepareStatement("select  * from book where id = ?");
            preparedStatement.setLong(1,title_book.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("name :" +resultSet.getString("name"));
                System.out.println("nasher:" +resultSet.getString("nasher"));
                System.out.println("chap :" +resultSet.getString("chap"));
                System.out.println("id :" +resultSet.getLong("id"));
                System.out.println("title_id :" +resultSet.getString("title"));
            } }
        catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void removebook(long title_book) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zareii", "myjava123")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from book where id=? ");
            preparedStatement1.setLong(1,Title_book.getId);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from book where id=?");
                preparedStatement.setLong(1,Title_book.getId);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                preparedStatement1.close();
                connection.close();
            }else {
                System.out.println("your employee's code is wrong!!!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void select(Title_book title_book){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zareii", "myjava123")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from book where id=? ");
            preparedStatement1.setLong(1, title_book.getId());
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                System.out.println("update book : ");
                System.out.println("pls enter book's name : ");
                String Name=input.next();
                System.out.println("pls enter book's id : ");
                int ID=input.nextInt();
                System.out.println("pls enter book  nasher : ");
                String Nasher=input.next();
                System.out.println("pls enter student's chap : ");
                String Chap=input.next();
                System.out.println("pls enter student's id_title : ");
                String  Title=input.next();
                update(title_book.getTitle(),title_book.getChap(),title_book.getName(),title_book.getNasher(),title_book.getId());
            }else {
                System.out.println("your BOOK ID is wrong!!!");
            }
            resultSet.close();
            preparedStatement1.close();
            connection.close();
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }

    private void update(String title, String chap, String name, String nasher, Integer id) {

    }

    public void update(Title_book title_book  ){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zareii", "myjava123")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("update book set name=? , id=? , nasher=? , chap=?,id_itle = ? where id=?");
            preparedStatement.setString(1,title_book.getName() );
            preparedStatement.setString(2, title_book.getTitle());
            preparedStatement.setString(3, title_book.getNasher());
            preparedStatement.setLong(4, title_book.getId());
            preparedStatement.setString(5, title_book.getChap());
            System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
            System.out.println("student information update.");
            preparedStatement.close();
            connection.close();
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }


    public void showinfo(long getId, Object getName, String chap, Object gettitle, Object getNasher) {
    }

    public void addbook(long getId, String chap, Object getName, Object getNasher, Object gettitle) {

    }
    public void showtitle(Title_book title_book) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nargesmirheydari", "narges1380")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement =connection.prepareStatement("select  * from book where id = ?");
            preparedStatement.setLong(1,title_book.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                System.out.println("title :" +resultSet.getString("title"));
            } }
        catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
}
