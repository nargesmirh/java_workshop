/*
 * Created by JFormDesigner on Mon Dec 14 23:02:56 IRST 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import com.company.controller.CardController;
import com.company.controller.DriverController;
import com.company.controller.OfficerController;
import com.company.model.Card.CardService;
import com.company.model.Officer.OfficerEntity;
import com.company.model.Officer.OfficerRepository;
import net.miginfocom.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.GroupLayout;
/**
 * @author unknown
 */
public class login {
    public login() {
        initComponents();
        login.setVisible(true);
      login.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //driver
    private void button2MouseClicked(MouseEvent e) {
        login.setVisible(false);
        driver.setVisible(true);
    }
    //name of driver
    private void textField3MouseClicked(MouseEvent e) {
        if(textField3.getText().equals("name of driver:")) {
            textField3.setText("");
        }
    }
    //number of plaque
    private void textField4MouseClicked(MouseEvent e) {
        if(textField4.getText().equals("number of plaque:")){
            textField4.setText("");

        }
    }
    //car owner certificated number
    private void textField21MouseClicked(MouseEvent e) {
        if(textField2.getText().equals("car owner certificated number:")){
          textField2.setText("");
        }
    }
    //cardholder card  number
    private void textField22MouseClicked(MouseEvent e) {
       if(textField22.getText().equals("cardholder card number:")){
           textField22.setText("");
       }
    }
    //car owner insurance policy number
    private void textField23MouseClicked(MouseEvent e) {
       if(textField23.getText().equals("car owner insurance policy number:")) {
           textField23.setText("");
       }
    }
    //ok(finish driver menue)
    DriverController driverController=new DriverController();
    private void button4MouseClicked(MouseEvent e) {
        if(textField3.getText().equals("name of driver:") || textField3.getText().equals("")) {
            login.setVisible(false);
            label7.setText("please enter name of driver");
            dialog7.setVisible(true);


        }
        else if (textField4.getText().equals("number of plaque:") || textField4.getText().equals("")){
            login.setVisible(false);
            label7.setText("please enter name of plaque");
            dialog7.setVisible(true);

        }
        else if (textField2.getText().equals("car owner certificated number:") || textField2.getText().equals("")){
            login.setVisible(false);
            label7.setText("please enter certificated number");
            dialog7.setVisible(true);

        }
        else if(textField22.getText().equals(" card number:") || textField22.getText().equals("")){
            login.setVisible(false);
            label7.setText("please enter card number");
            dialog7.setVisible(true);
        }
        else if (textField23.getText().equals("car owner insurance policy number:") || textField23.getText().equals("")){
            login.setVisible(false);
            label7.setText("please enter car owner insurance policy number");
            dialog7.setVisible(true);

        }
        else if(driverController.Driverreport(textField4.getText())){
            driver.setVisible(false);
            drivertable.setVisible(true);

        }

        else {
            label7.setText("please enter the information correctlly");
            dialog7.setVisible(true);
        }
    }

    //officer
    private void button1MouseClicked(MouseEvent e) {
       login.setVisible(false);
       officer.setVisible(true);
    }
    //officer code
    private void textField1MouseClicked(MouseEvent e) {
        if(textField1.getText().equals("officer code:")){
            textField1.setText("");

        }
    }
    //password
    private void textField2MouseClicked(MouseEvent e) {
       if(textField2.getText().equals("password:")){
           textField2.setText("");
       }
    }
    //name
    private void textField15MouseClicked(MouseEvent e) {
        if(textField15.getText().equals("name:")){
            textField15.setText("");
        }
    }
    //car owner name
    private void textField16MouseClicked(MouseEvent e) {
        if(textField16.getText().equals("car owner name:")){
            textField16.setText("");
        }
    }
    //car's plate number
    private void textField17MouseClicked(MouseEvent e) {
        if(textField17.getText().equals("car's plate number:")){
            textField17.setText("");
        }
    }
    //car owner certificated number
    private void textField18MouseClicked(MouseEvent e) {
       if(textField18.getText().equals("car owner certificated number:")){
           textField18.setText("");
       }
    }
    //cardholder card number
    private void textField19MouseClicked(MouseEvent e) {
        if (textField19.getText().equals(" card number:")){
            textField19.setText("");
        }
    }
    //car owner insurance policy number
    private void textField20MouseClicked(MouseEvent e) {
        if(textField20.getText().equals("car owner insurance policy number:")){
            textField20.setText("");
        }
    }
    //ok(finish menue of officer)
    OfficerRepository officerRepository;

    {
        try {
            officerRepository = new OfficerRepository();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void button3MouseClicked(MouseEvent e) {
        OfficerEntity entity =new OfficerEntity();
        if(textField1.getText().equals("officer code:") || textField1.getText().equals("")){
            label6.setText("please enter officer code ");
            dialog6.setVisible(true);
        }
        else if(textField2.getText().equals("password:") || textField2.getText().equals("")){
            label6.setText("please enter password ");
            dialog6.setVisible(true);
        }
        else if(textField15.getText().equals("name:") || textField15.getText().equals("")){

            label6.setText("please enter car owner name ");
            dialog6.setVisible(true);
        }
        else if (textField16.getText().equals("car owner name:") || textField16.getText().equals("")){

            label6.setText("please enter officer code ");
            dialog6.setVisible(true);

        }
        else if(textField17.getText().equals("car's plate number:") || textField17.getText().equals("")){

            label6.setText("please enter car's plate number ");
            dialog6.setVisible(true);

        }
        else if(textField18.getText().equals("car owner certificated number:") || textField18.getText().equals("")){

            label6.setText("please enter car owner certificated number ");
            dialog6.setVisible(true);

        }
        else if(textField19.getText().equals(" card number:") || textField19.getText().equals("")){

            label6.setText("please enter card number ");
            dialog6.setVisible(true);

        }
        else if(textField20.getText().equals("car owner insurance policy number:") || textField20.getText().equals("")){

            label6.setText("please enter car owner insurance policy number ");
            dialog6.setVisible(true);

        }
        else {
            entity.setOfficerCode(textField1.getText());
            entity.setPasswordOfficer(textField2.getText());
            entity.setOfficerName(textField15.getText());
            entity.setCarOwnerName(textField16.getText());
            entity.setNumberOfPlaque(textField17.getText());
            entity.setCertificateNumber(textField18.getText());
            entity.setNumberOfCardmachine(textField19.getText());
            entity.setInsuranceNumber(textField20.getText());
            OfficerController controller = new OfficerController();
            try {
                if (controller.select1(entity)) {
                    officer.setVisible(false);
                    officertable.setVisible(true);
                } else {
                    officer.setVisible(false);
                    label6.setText(":)))))))))");
                    dialog6.setVisible(true);
                }
            }catch (NullPointerException ex){
                System.out.println("User name Or Password is incorrect");
            }
        }
    }
    //driver table
    //Municipal services (receive traffic plan)
    private void button11MouseClicked(MouseEvent e) {
    drivertable.setVisible(false);
    frame3.setVisible(true);
    }
    //Road services (online payment of registered electric tolls)
    private void button12MouseClicked(MouseEvent e) {
       drivertable.setVisible(false);
       frame6.setVisible(true);
    }
    //Inquire a negative score and violation
    private void button13MouseClicked(MouseEvent e) {
        driverController.nump=textField4.getText();
        label5.setText(textField4.getText()+"\t\t\t"+officerController.selectPlague(textField4.getText()));
        drivertable.setVisible(false);
        dialog5.setVisible(true);
    }
    //officer table
    //Inquiry of violations and nagative score
    OfficerController officerController=new OfficerController();
    private void button7MouseClicked(MouseEvent e) {
        String plague , name;
        plague = textField17.getText();
        name = textField15.getText();
//        officerController.Plaque=textField17.getText();
//        officerController.name=textField15.getText();
        label1.setText(String.valueOf(officerController.select(plague , name)));
        officertable.setVisible(false);
        dialog1.setVisible(true);
    }
    //Record violations and negative scores and the amount of fines each
    private void button9MouseClicked(MouseEvent e) {
       officertable.setVisible(false);
       frame1.setVisible(true);
    }
    //Accident registration
    private void button10MouseClicked(MouseEvent e) {
        officertable.setVisible(false);
        frame4.setVisible(true);
    }
    //Inquiry into traffic accidents
    private void button5MouseClicked(MouseEvent e) {
        String plague , name;
        plague = textField17.getText();
        name = textField15.getText();

        label2.setText(String.valueOf(officerController.select2(plague , name)));
        officertable.setVisible(false);
        dialog2.setVisible(true);
    }
    //Municipal services (receive traffic plan)exit
    private void button22MouseClicked(MouseEvent e) {
        dialog3.setVisible(false);
        drivertable.setVisible(true);
    }
    //Inquire a negative score and violation payment
    private void button24MouseClicked(MouseEvent e) {
//        textField31.setText(String.valueOf(officerController.select()));
//        dialog5.setVisible(false);
//        frame8.setVisible(true);
    }

    //Road services (online payment of registered electric tolls)
    //number of card
    private void textField11MouseClicked(MouseEvent e) {
        if(textField11.getText().equals("number of card:")){
            textField11.setText("");
        }
    }
    //password of card
    private void textField13MouseClicked(MouseEvent e) {
        if(textField13.getText().equals("password of card:")){
            textField13.setText("");
        }

    }
    //amount:
    private void textField14MouseClicked(MouseEvent e) {
        label10.setVisible(true);
    }
    //payment

    private void button26MouseClicked(MouseEvent e) {
        cardController.number=textField11.getText();
        Long text14;
        text14=Long.parseLong(textField14.getText());
        if(textField11.getText().equals("number of card:") || textField11.getText().equals("")){
         label4.setText("please enter number of card correctlly");
         dialog4.setVisible(true);
        }
        else if (textField13.getText().equals("password of card:") || textField13.getText().equals("")){
            label4.setText("please enter password of card correctlly");
            dialog4.setVisible(true);
        }
        else if (text14<=cardController.Cardreport()){
            cardController.password=textField13.getText();
            Long amount=cardController.Cardreport();
            amount=amount-50;
            cardController.invontry1=amount;
            cardController.Cardedit();
            frame6.setVisible(false);
            label3.setText("payment successfully :))))))))))))))))))");
            dialog3.setVisible(true);

        }
        else if (text14>(cardController.Cardreport())){
            frame6.setVisible(false);
            label3.setText("your invontry is less than amount :)");
            dialog3.setVisible(true);
        }
    }
    //Municipal services (receive traffic plan)
    //number of card
    private void textField28MouseClicked(MouseEvent e) {
        if(textField28.getText().equals("number of card:")){
            textField28.setText("");
        }
    }
    //password of card
    private void textField30MouseClicked(MouseEvent e) {
        if(textField30.getText().equals("password of card:")){
            textField30.setText("");
        }
    }
    //amount:
    private void textField9MouseClicked(MouseEvent e) {
       label10.setVisible(true);
    }
    //payment
    CardController cardController=new CardController();
    private void button21MouseClicked(MouseEvent e) {
        Long text9;
        text9=Long.parseLong(textField9.getText());
        cardController.number=textField28.getText();
        if(textField28.getText().equals("number of card:") || textField28.getText().equals("")){
          label4.setText("please enter number of card");
          dialog4.setVisible(true);
        }
        else if(textField30.getText().equals("password of card:") || textField30.getText().equals("")){
          label4.setText("please enter password of card");
          dialog4.setVisible(true);
        }
        else if (text9<=cardController.Cardreport()){
            cardController.password=textField30.getText();
            Long amount=cardController.Cardreport();
            amount=amount-123;
            cardController.invontry1=amount;
            cardController.Cardedit();
            frame3.setVisible(false);
            label3.setText("payment successfully :))))))))))))))))))");
            dialog3.setVisible(true);

        }
        else if (text9>cardController.Cardreport()){
            frame3.setVisible(false);
            label3.setText("your invontry is less than amount :)");
            dialog3.setVisible(true);
        }
    }
    //Record violations and negative scores and the amount of fines each
    //time
    private void textField5MouseClicked(MouseEvent e) {
        if(textField5.getText().equals("time:")){
            textField5.setText("");
        }
    }
    //date
    private void textField6MouseClicked(MouseEvent e) {
       if(textField6.getText().equals("date:")){
           textField6.setText("");

       }
    }
    //negative point
    private void textField7MouseClicked(MouseEvent e) {
       if(textField7.getText().equals("nagative point:")){
           textField7.setText("");
       }
    }
    //the amount of fines
    private void textField8MouseClicked(MouseEvent e) {
        if (textField8.getText().equals("the amount of fines:")){
            textField8.setText("");
        }
    }
    //violation
    private void textField34MouseClicked(MouseEvent e) {
       if(textField34.getText().equals("violation:")){
           textField34.setText("");
       }
    }
    //Record violations and negative scores and the amount of fines each(ok)
    private void button6MouseClicked(MouseEvent e) {
        if(textField5.getText().equals("time:") || textField5.getText().equals("")){
            label8.setText("please enter time correcctlly");
            dialog8.setVisible(true);
        }
        else if(textField6.getText().equals("date:") || textField6.getText().equals("")){
            label8.setText("please enter date correcctlly");
            dialog8.setVisible(true);
        }
        else if(textField7.getText().equals("nagative point:") || textField7.getText().equals("")){
            label8.setText("please enter nagative point correcctlly");
            dialog8.setVisible(true);
        }
        else if(textField8.getText().equals("the amount of fines:") || textField8.getText().equals("")){
            label8.setText("please enter the amount of fines correcctlly");
            dialog8.setVisible(true);
        }
        else if(textField34.getText().equals("violation:") || textField34.getText().equals("")){
            label8.setText("please enter violation correcctlly");
            dialog8.setVisible(true);
        }
        else{
            officerController.times=textField5.getText();
            officerController.dates=textField6.getText();
            officerController.point=textField7.getText();
            officerController.amountfines= Long.parseLong(textField8.getText());
            officerController.violation=textField34.getText();
            officerController.code=textField1.getText();
            officerController.password=textField2.getText();
            officerController.name=textField15.getText();
            officerController.Plaque=textField17.getText();
            officerController.Officersave();
            label8.setText("successfull:))))");
            frame1.setVisible(false);
            officertable.setVisible(true);
            dialog8.setVisible(true);

        }
    }
    //Inquiry of violations and nagative score
    //number of plaque:
    //Accident registration
    //time
    private void textField29MouseClicked(MouseEvent e) {

        if(textField29.getText().equals("time:")){
            textField29.setText("");
        }
    }
    //date
    private void textField26MouseClicked(MouseEvent e) {
        if(textField26.getText().equals("date:") ){
            textField26.setText("");
        }
    }
    //description of accidents
    private void textField27MouseClicked(MouseEvent e) {
        if(textField27.getText().equals("description of accidents:")){
            textField27.setText("");
        }
    }
    //inquiry into traffic accidents
    //ok
    private void button18MouseClicked(MouseEvent e) {
        if(textField29.getText().equals("time:") || textField29.getText().equals("")){
            label9.setText("please enter time correctlly");
            dialog9.setVisible(true);
        }
        else if(textField26.getText().equals("date:") || textField26.getText().equals("")){
            label9.setText("please enter date correctlly");
            dialog9.setVisible(true);
        }
        else if(textField27.getText().equals("description of accidents:") || textField27.getText().equals("")){
            label9.setText("please enter description of accidents correctlly");
            dialog9.setVisible(true);
        }
        else{
            officerController.times=textField29.getText();
            officerController.dates=textField26.getText();
            officerController.description=textField27.getText();
            officerController.code=textField1.getText();
            officerController.password=textField2.getText();
            officerController.name=textField15.getText();
            officerController.Plaque=textField17.getText();
            officerController.Officersave1();
            label8.setText("successfull:))))");
            frame4.setVisible(false);
            officertable.setVisible(true);
            dialog8.setVisible(true);
        }
    }
    //inquiry into traffic accidents
    //number of plaque
     //Inquire a negative score and violation(driver)
    private void textField24MouseClicked(MouseEvent e) {
        if (textField24.getText().equals("number of card:")){
        textField24.setText("");
        }
    }

    private void textField25MouseClicked(MouseEvent e) {
        if(textField25.getText().equals("password of card:")){
         textField25.setText("");
        }
    }
    //amount
    private void textField31MouseClicked(MouseEvent e) {
    dialog10.setVisible(true);
    }

    private void button23MouseClicked(MouseEvent e) {
        Long text31;
        text31=Long.parseLong(textField31.getText());
       if(textField24.getText().equals("number of card:") || textField24.getText().equals("")){
           label4.setText("please enter number of card correctly");
           dialog4.setVisible(true);

       }
       else if (textField25.getText().equals("password of card:") || textField25.getText().equals("")) {
            label4.setText("please enter password of card correctly");
            dialog4.setVisible(true);
        }
       else if (text31>=cardController.Cardreport()){
           cardController.number=textField24.getText();
           cardController.password=textField25.getText();
           Long amount=cardController.Cardreport();
           amount=amount-500000;
           cardController.invontry1=amount;
           cardController.Cardedit();
           frame8.setVisible(false);
           label4.setText("payment successfully :))))))))))))))))))");
           dialog4.setVisible(true);

        }
       else if(text31<cardController.Cardreport()){
           frame8.setVisible(false);
           label4.setText("your invontery is less");
           dialog4.setVisible(true);
       }
    }

    private void dialog9MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button8MouseClicked(MouseEvent e) {
        dialog1.setVisible(false);
        officertable.setVisible(true);
    }

    private void button14MouseClicked(MouseEvent e) {
        dialog1.setVisible(false);
        officertable.setVisible(true);

    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nargesmirh
        login = new JFrame();
        button1 = new JButton();
        button2 = new JButton();
        officer = new JFrame();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField15 = new JTextField();
        textField16 = new JTextField();
        textField17 = new JTextField();
        textField18 = new JTextField();
        textField19 = new JTextField();
        textField20 = new JTextField();
        button3 = new JButton();
        driver = new JFrame();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField21 = new JTextField();
        textField22 = new JTextField();
        textField23 = new JTextField();
        button4 = new JButton();
        officertable = new JFrame();
        button7 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button5 = new JButton();
        drivertable = new JFrame();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        frame1 = new JFrame();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        textField34 = new JTextField();
        button6 = new JButton();
        frame4 = new JFrame();
        textField29 = new JTextField();
        textField26 = new JTextField();
        textField27 = new JTextField();
        button18 = new JButton();
        dialog1 = new JDialog();
        label1 = new JLabel();
        button14 = new JButton();
        dialog2 = new JDialog();
        label2 = new JLabel();
        button8 = new JButton();
        frame3 = new JFrame();
        textField28 = new JTextField();
        textField30 = new JTextField();
        textField9 = new JTextField();
        button21 = new JButton();
        frame6 = new JFrame();
        textField11 = new JTextField();
        textField13 = new JTextField();
        textField14 = new JTextField();
        button26 = new JButton();
        dialog3 = new JDialog();
        label3 = new JLabel();
        button22 = new JButton();
        dialog4 = new JDialog();
        label4 = new JLabel();
        dialog5 = new JDialog();
        label5 = new JLabel();
        button24 = new JButton();
        dialog6 = new JDialog();
        label6 = new JLabel();
        dialog7 = new JDialog();
        label7 = new JLabel();
        dialog8 = new JDialog();
        label8 = new JLabel();
        dialog9 = new JDialog();
        label9 = new JLabel();
        dialog10 = new JDialog();
        label10 = new JLabel();
        frame8 = new JFrame();
        textField24 = new JTextField();
        textField25 = new JTextField();
        textField31 = new JTextField();
        button23 = new JButton();

        //======== login ========
        {
            login.setTitle("welcome:)");
            var loginContentPane = login.getContentPane();
            loginContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- button1 ----
            button1.setText("officer");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            loginContentPane.add(button1, "cell 4 2 6 2");

            //---- button2 ----
            button2.setText("driver");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            loginContentPane.add(button2, "cell 5 6 4 2");
            login.pack();
            login.setLocationRelativeTo(login.getOwner());
        }

        //======== officer ========
        {
            officer.setTitle("officer");
            var officerContentPane = officer.getContentPane();
            officerContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- textField1 ----
            textField1.setText("officer code:");
            textField1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField1MouseClicked(e);
                }
            });
            officerContentPane.add(textField1, "cell 8 1 19 2");

            //---- textField2 ----
            textField2.setText("password:");
            textField2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField2MouseClicked(e);
                }
            });
            officerContentPane.add(textField2, "cell 8 3 19 1");

            //---- textField15 ----
            textField15.setText("name:");
            textField15.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField15MouseClicked(e);
                }
            });
            officerContentPane.add(textField15, "cell 8 4 19 1");

            //---- textField16 ----
            textField16.setText("Car owner name:");
            textField16.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField16MouseClicked(e);
                }
            });
            officerContentPane.add(textField16, "cell 8 5 19 1");

            //---- textField17 ----
            textField17.setText("car's plaque number:");
            textField17.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField17MouseClicked(e);
                }
            });
            officerContentPane.add(textField17, "cell 8 6 19 1");

            //---- textField18 ----
            textField18.setText("Car owner certificate number:");
            textField18.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField18MouseClicked(e);
                }
            });
            officerContentPane.add(textField18, "cell 8 7 19 1");

            //---- textField19 ----
            textField19.setText(" card number:");
            textField19.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField19MouseClicked(e);
                }
            });
            officerContentPane.add(textField19, "cell 8 8 19 1");

            //---- textField20 ----
            textField20.setText("Car owner insurance policy number:");
            textField20.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField20MouseClicked(e);
                }
            });
            officerContentPane.add(textField20, "cell 8 9 19 1");

            //---- button3 ----
            button3.setText("ok");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            officerContentPane.add(button3, "cell 27 13 3 1");
            officer.pack();
            officer.setLocationRelativeTo(officer.getOwner());
        }

        //======== driver ========
        {
            driver.setTitle("driver");
            var driverContentPane = driver.getContentPane();
            driverContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- textField3 ----
            textField3.setText("name of driver:");
            textField3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField3MouseClicked(e);
                }
            });
            driverContentPane.add(textField3, "cell 4 1 8 1");

            //---- textField4 ----
            textField4.setText("number of Plaque:");
            textField4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField4MouseClicked(e);
                }
            });
            driverContentPane.add(textField4, "cell 4 2 8 1");

            //---- textField21 ----
            textField21.setText("Car owner certificate number:");
            textField21.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField21MouseClicked(e);
                }
            });
            driverContentPane.add(textField21, "cell 4 3 8 1");

            //---- textField22 ----
            textField22.setText(" card number:");
            textField22.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField22MouseClicked(e);
                }
            });
            driverContentPane.add(textField22, "cell 4 4 8 1");

            //---- textField23 ----
            textField23.setText("Car owner insurance policy number:");
            textField23.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField23MouseClicked(e);
                }
            });
            driverContentPane.add(textField23, "cell 4 5 8 1");

            //---- button4 ----
            button4.setText("ok");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            driverContentPane.add(button4, "cell 13 6");
            driver.pack();
            driver.setLocationRelativeTo(driver.getOwner());
        }

        //======== officertable ========
        {
            officertable.setTitle("officer table");
            var officertableContentPane = officertable.getContentPane();
            officertableContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- button7 ----
            button7.setText("Inquiry of violations and nagative score");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            officertableContentPane.add(button7, "cell 4 0");

            //---- button9 ----
            button9.setText("Record violations and negative scores and the amount of fines each");
            button9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button9MouseClicked(e);
                }
            });
            officertableContentPane.add(button9, "cell 4 1");

            //---- button10 ----
            button10.setText("Accident registration");
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }
            });
            officertableContentPane.add(button10, "cell 4 2");

            //---- button5 ----
            button5.setText("Inquiry into traffic accidents");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            officertableContentPane.add(button5, "cell 4 3");
            officertable.pack();
            officertable.setLocationRelativeTo(officertable.getOwner());
        }

        //======== drivertable ========
        {
            drivertable.setTitle("driver table");
            var drivertableContentPane = drivertable.getContentPane();
            drivertableContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- button11 ----
            button11.setText("Municipal services (receive traffic plan)");
            button11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button11MouseClicked(e);
                }
            });
            drivertableContentPane.add(button11, "cell 2 1 7 1");

            //---- button12 ----
            button12.setText("Road services (online payment of registered electric tolos)");
            button12.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button12MouseClicked(e);
                }
            });
            drivertableContentPane.add(button12, "cell 2 2 7 1");

            //---- button13 ----
            button13.setText("Inquiry a negative score and violation");
            button13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button13MouseClicked(e);
                }
            });
            drivertableContentPane.add(button13, "cell 2 3 7 1");
            drivertable.pack();
            drivertable.setLocationRelativeTo(drivertable.getOwner());
        }

        //======== frame1 ========
        {
            frame1.setTitle("Record violations and negative scores and the amount of fines each");
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- textField5 ----
            textField5.setText("time:");
            textField5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField5MouseClicked(e);
                }
            });
            frame1ContentPane.add(textField5, "cell 7 1 11 1");

            //---- textField6 ----
            textField6.setText("date:");
            textField6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField6MouseClicked(e);
                }
            });
            frame1ContentPane.add(textField6, "cell 7 2 11 1");

            //---- textField7 ----
            textField7.setText("negative point:");
            textField7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField7MouseClicked(e);
                }
            });
            frame1ContentPane.add(textField7, "cell 7 3 11 1");

            //---- textField8 ----
            textField8.setText("The amount of fines:");
            textField8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField8MouseClicked(e);
                }
            });
            frame1ContentPane.add(textField8, "cell 7 4 11 1");

            //---- textField34 ----
            textField34.setText("violation:");
            textField34.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField34MouseClicked(e);
                }
            });
            frame1ContentPane.add(textField34, "cell 7 5 11 1");

            //---- button6 ----
            button6.setText("ok");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            frame1ContentPane.add(button6, "cell 18 12");
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }

        //======== frame4 ========
        {
            frame4.setTitle("Accident registration");
            var frame4ContentPane = frame4.getContentPane();
            frame4ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- textField29 ----
            textField29.setText("time:");
            textField29.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField29MouseClicked(e);
                }
            });
            frame4ContentPane.add(textField29, "cell 3 1 7 1");

            //---- textField26 ----
            textField26.setText("date:");
            textField26.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField26MouseClicked(e);
                }
            });
            frame4ContentPane.add(textField26, "cell 3 2 7 1");

            //---- textField27 ----
            textField27.setText("Description of accidents:");
            textField27.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField27MouseClicked(e);
                }
            });
            frame4ContentPane.add(textField27, "cell 0 3 11 2");

            //---- button18 ----
            button18.setText("ok");
            button18.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button18MouseClicked(e);
                }
            });
            frame4ContentPane.add(button18, "cell 10 7");
            frame4.pack();
            frame4.setLocationRelativeTo(frame4.getOwner());
        }

        //======== dialog1 ========
        {
            dialog1.setTitle("Inquiry of violations and nagative score");
            var dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("text");
            dialog1ContentPane.add(label1, "cell 0 0 19 8");

            //---- button14 ----
            button14.setText("exit");
            button14.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button14MouseClicked(e);
                }
            });
            dialog1ContentPane.add(button14, "cell 16 8");
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== dialog2 ========
        {
            dialog2.setTitle("Inquiry into traffic accidents");
            var dialog2ContentPane = dialog2.getContentPane();
            dialog2ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label2 ----
            label2.setText("text");
            dialog2ContentPane.add(label2, "cell 0 0 37 3");

            //---- button8 ----
            button8.setText("exit");
            button8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button8MouseClicked(e);
                }
            });
            dialog2ContentPane.add(button8, "cell 14 8");
            dialog2.pack();
            dialog2.setLocationRelativeTo(dialog2.getOwner());
        }

        //======== frame3 ========
        {
            frame3.setTitle("Municipal services (receive traffic plan)");
            var frame3ContentPane = frame3.getContentPane();
            frame3ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- textField28 ----
            textField28.setText("number of card:");
            textField28.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField28MouseClicked(e);
                }
            });
            frame3ContentPane.add(textField28, "cell 4 1 10 1");

            //---- textField30 ----
            textField30.setText("password of card:");
            textField30.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField30MouseClicked(e);
                }
            });
            frame3ContentPane.add(textField30, "cell 4 2 10 1");

            //---- textField9 ----
            textField9.setText("123");
            textField9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField9MouseClicked(e);
                }
            });
            frame3ContentPane.add(textField9, "cell 4 3 10 1");

            //---- button21 ----
            button21.setText("payment");
            button21.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button21MouseClicked(e);
                }
            });
            frame3ContentPane.add(button21, "cell 16 6");
            frame3.pack();
            frame3.setLocationRelativeTo(frame3.getOwner());
        }

        //======== frame6 ========
        {
            frame6.setTitle("Road services (online payment of registered electric tolls)");
            var frame6ContentPane = frame6.getContentPane();
            frame6ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- textField11 ----
            textField11.setText("number of card:");
            textField11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField11MouseClicked(e);
                }
            });
            frame6ContentPane.add(textField11, "cell 3 1 9 1");

            //---- textField13 ----
            textField13.setText("password of card:");
            textField13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField13MouseClicked(e);
                }
            });
            frame6ContentPane.add(textField13, "cell 3 2 9 1");

            //---- textField14 ----
            textField14.setText("50");
            textField14.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField14MouseClicked(e);
                }
            });
            frame6ContentPane.add(textField14, "cell 3 3 9 1");

            //---- button26 ----
            button26.setText("payment");
            button26.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button26MouseClicked(e);
                }
            });
            frame6ContentPane.add(button26, "cell 13 5");
            frame6.pack();
            frame6.setLocationRelativeTo(frame6.getOwner());
        }

        //======== dialog3 ========
        {
            dialog3.setTitle("Municipal services (receive traffic plan)");
            var dialog3ContentPane = dialog3.getContentPane();
            dialog3ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label3 ----
            label3.setText("text");
            dialog3ContentPane.add(label3, "cell 0 0 14 4");

            //---- button22 ----
            button22.setText("EXIT");
            button22.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button22MouseClicked(e);
                }
            });
            dialog3ContentPane.add(button22, "cell 12 7");
            dialog3.pack();
            dialog3.setLocationRelativeTo(dialog3.getOwner());
        }

        //======== dialog4 ========
        {
            dialog4.setTitle("ERROR");
            var dialog4ContentPane = dialog4.getContentPane();
            dialog4ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label4 ----
            label4.setText("text");
            dialog4ContentPane.add(label4, "cell 0 3 19 1");
            dialog4.pack();
            dialog4.setLocationRelativeTo(dialog4.getOwner());
        }

        //======== dialog5 ========
        {
            dialog5.setTitle("Inquire a negative score and violation");
            var dialog5ContentPane = dialog5.getContentPane();
            dialog5ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label5 ----
            label5.setText("text");
            dialog5ContentPane.add(label5, "cell 0 0 12 11");

            //---- button24 ----
            button24.setText("payment");
            button24.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button24MouseClicked(e);
                }
            });
            dialog5ContentPane.add(button24, "cell 11 12");
            dialog5.pack();
            dialog5.setLocationRelativeTo(dialog5.getOwner());
        }

        //======== dialog6 ========
        {
            dialog6.setTitle("officer error");
            var dialog6ContentPane = dialog6.getContentPane();
            dialog6ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label6 ----
            label6.setText("text");
            dialog6ContentPane.add(label6, "cell 0 1 16 4");
            dialog6.pack();
            dialog6.setLocationRelativeTo(dialog6.getOwner());
        }

        //======== dialog7 ========
        {
            dialog7.setTitle("driver error");
            var dialog7ContentPane = dialog7.getContentPane();
            dialog7ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label7 ----
            label7.setText("text");
            dialog7ContentPane.add(label7, "cell 0 2 5 1");
            dialog7.pack();
            dialog7.setLocationRelativeTo(dialog7.getOwner());
        }

        //======== dialog8 ========
        {
            var dialog8ContentPane = dialog8.getContentPane();
            dialog8ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label8 ----
            label8.setText("text");
            dialog8ContentPane.add(label8, "cell 0 1 18 3");
            dialog8.pack();
            dialog8.setLocationRelativeTo(dialog8.getOwner());
        }

        //======== dialog9 ========
        {
            dialog9.setTitle("accdinet regestrathion error");
            dialog9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dialog9MouseClicked(e);
                }
            });
            var dialog9ContentPane = dialog9.getContentPane();
            dialog9ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label9 ----
            label9.setText("text");
            dialog9ContentPane.add(label9, "cell 0 2 10 3");
            dialog9.pack();
            dialog9.setLocationRelativeTo(dialog9.getOwner());
        }

        //======== dialog10 ========
        {
            var dialog10ContentPane = dialog10.getContentPane();
            dialog10ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label10 ----
            label10.setText("you cant  change  this item :))");
            dialog10ContentPane.add(label10, "cell 0 2 18 1");
            dialog10.pack();
            dialog10.setLocationRelativeTo(dialog10.getOwner());
        }

        //======== frame8 ========
        {
            frame8.setTitle("Inquire a negative score and violation");
            var frame8ContentPane = frame8.getContentPane();
            frame8ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- textField24 ----
            textField24.setText("number of card:");
            textField24.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField24MouseClicked(e);
                    textField24MouseClicked(e);
                }
            });
            frame8ContentPane.add(textField24, "cell 3 1 7 1");

            //---- textField25 ----
            textField25.setText("password of card:");
            textField25.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField25MouseClicked(e);
                    textField25MouseClicked(e);
                }
            });
            frame8ContentPane.add(textField25, "cell 3 2 7 1");

            //---- textField31 ----
            textField31.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField31MouseClicked(e);
                    textField31MouseClicked(e);
                }
            });
            frame8ContentPane.add(textField31, "cell 3 3 7 1");

            //---- button23 ----
            button23.setText("peyment");
            button23.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button23MouseClicked(e);
                    button23MouseClicked(e);
                }
            });
            frame8ContentPane.add(button23, "cell 17 6");
            frame8.pack();
            frame8.setLocationRelativeTo(frame8.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nargesmirh
    private JFrame login;
    private JButton button1;
    private JButton button2;
    private JFrame officer;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JButton button3;
    private JFrame driver;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JButton button4;
    private JFrame officertable;
    private JButton button7;
    private JButton button9;
    private JButton button10;
    private JButton button5;
    private JFrame drivertable;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JFrame frame1;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField34;
    private JButton button6;
    private JFrame frame4;
    private JTextField textField29;
    private JTextField textField26;
    private JTextField textField27;
    private JButton button18;
    private JDialog dialog1;
    private JLabel label1;
    private JButton button14;
    private JDialog dialog2;
    private JLabel label2;
    private JButton button8;
    private JFrame frame3;
    private JTextField textField28;
    private JTextField textField30;
    private JTextField textField9;
    private JButton button21;
    private JFrame frame6;
    private JTextField textField11;
    private JTextField textField13;
    private JTextField textField14;
    private JButton button26;
    private JDialog dialog3;
    private JLabel label3;
    private JButton button22;
    private JDialog dialog4;
    private JLabel label4;
    private JDialog dialog5;
    private JLabel label5;
    private JButton button24;
    private JDialog dialog6;
    private JLabel label6;
    private JDialog dialog7;
    private JLabel label7;
    private JDialog dialog8;
    private JLabel label8;
    private JDialog dialog9;
    private JLabel label9;
    private JDialog dialog10;
    private JLabel label10;
    private JFrame frame8;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField31;
    private JButton button23;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
