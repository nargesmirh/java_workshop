package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Unimain {
    private JFrame jFrame;

    public Unimain() {
        jFrame = new JFrame("system entekhab vahed");
        jFrame.setSize(400,440);
        Font font = new Font("TimesRoman",Font.BOLD,16);
        Font font1 = new Font("TimesRoman",Font.ITALIC,15);
        JLabel lblWelcome = new JLabel("Welcome");
        lblWelcome.setBounds(150,10,100,30);
        lblWelcome.setVisible(true);
        lblWelcome.setFont(font);
        JLabel lblSelect = new JLabel("choice your option");
        lblSelect.setBounds(75,30,200,30);
        lblSelect.setFont(font);
        lblSelect.setVisible(true);
        JButton btnRegistration = new JButton("Registration ");
        btnRegistration.setBounds(0,100,200,100);
        btnRegistration.setFont(font1);
        btnRegistration.setVisible(true);
        btnRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                UniRegistration uniRegistration = new UniRegistration();
                uniRegistration.registration();
            }
        });
        JButton btnEdit = new JButton("Edit ");
        btnEdit.setBounds(0,200,200,100);
        btnEdit.setFont(font1);
        btnEdit.setVisible(true);
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                UniEdit uniEdit = new UniEdit();
                uniEdit.edit();
            }
        });
        JButton btnRemove = new JButton("Delete ");
        btnRemove.setBounds(0,300,200,100);
        btnRemove.setFont(font1);
        btnRemove.setVisible(true);
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                UniDelete uniDelete = new UniDelete();
                uniDelete.delete();
            }
        });
        jFrame.add(lblWelcome);
        jFrame.add(lblSelect);
        jFrame.add(btnRegistration);
        jFrame.add(btnEdit);
        jFrame.add(btnRemove);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
