package view;

import controller.UniController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UniRegistration {
    public static JFrame jFrame;

    public void registration() {
        jFrame = new JFrame(" Registration ");
        jFrame.setSize(400,500);
        Font font = new Font("TimesRoman", Font.PLAIN, 17);
        Font font1 = new Font("TimesRoman", Font.BOLD, 16);
        JLabel lbltext = new JLabel("listen information");
        lbltext.setBounds(100,24,200,20);
        lbltext.setFont(font1);
        lbltext.setVisible(true);
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(30,100,100,30);
        lblName.setFont(font);
        lblName.setVisible(true);
        JTextField txtName = new JTextField();
        txtName.setBounds(100,105,120,25);
        txtName.setVisible(true);
        JLabel lblCode = new JLabel("Code:");
        lblCode.setBounds(30,150,100,30);
        lblCode.setFont(font);
        lblCode.setVisible(true);
        JTextField txtCode = new JTextField();
        txtCode.setBounds(120,155,80,25);
        txtCode.setVisible(true);
        JLabel lblCapacity = new JLabel("capacity:");
        lblName.setBounds(30,100,100,30);
        lblName.setFont(font);
        lblName.setVisible(true);
        JTextField txtCapacity = new JTextField();
        txtName.setBounds(100,105,120,25);
        txtName.setVisible(true);
        JLabel lblUnit = new JLabel("unit:");
        lblCode.setBounds(30,150,100,30);
        lblCode.setFont(font);
        lblCode.setVisible(true);
        JTextField txtUnit = new JTextField();
        txtCode.setBounds(120,155,80,25);
        txtCode.setVisible(true);

        JButton btnSave = new JButton("Register");
        btnSave.setBounds(150,380,100,45);
        btnSave.setFont(font);
        btnSave.setVisible(true);
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UniController.getInstance().insert(txtName.getText(), Integer.parseInt(txtCode.getText()), txtCapacity.getText(),Integer.parseInt(txtUnit.getText()));
                } catch(Exception e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        jFrame.add(lbltext);
        jFrame.add(lblName);
        jFrame.add(txtName);
        jFrame.add(lblCode);
        jFrame.add(txtCode);
        jFrame.add(lblCapacity);
        jFrame.add(txtCapacity);
        jFrame.add(lblUnit);
        jFrame.add(txtUnit);
        jFrame.add(btnSave);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

}
