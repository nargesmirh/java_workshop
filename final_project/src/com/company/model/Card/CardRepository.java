package com.company.model.Card;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CardRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public CardRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mirh", "narges1380");
        connection.setAutoCommit(false);

    }
    public void update(CardEntity cardEntity) throws Exception{
        preparedStatement=connection.prepareStatement("UPDATE Card set Inventory=? WHERE CardNumber=? and CardPassword=?");
        preparedStatement.setLong(1,cardEntity.getInventory());
        preparedStatement.setString(2,cardEntity.getCardNumber());
        preparedStatement.setString(3,cardEntity.getCardPassword());
        preparedStatement.executeUpdate();
    }
    public long report(CardEntity cardEntity) throws Exception{
        preparedStatement=connection.prepareStatement("select * from Card  WHERE CardNumber=? ");
        preparedStatement.setString(1,cardEntity.getCardNumber());
        ResultSet resultSet = preparedStatement.executeQuery();
        long inventory = 0;
        if(resultSet.next()){
            inventory=resultSet.getLong("inventory");
        }
        else{
            System.out.println("number of card is wrong:))))))))))))))))))))))");
        }
        return inventory;


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
