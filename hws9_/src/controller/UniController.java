package controller;

import model.entity.unientity;
import model.service.UniService;
import view.UniDelete;
import view.UniEdit;
import view.UniRegistration;

import javax.swing.*;
import java.util.List;

public class UniController {

    private static UniController uniController = new UniController();

    public static UniController getInstance() {
        return uniController;
    }

    private UniController() {

    }

    public void insert(String name, int code, String capacity, int unit) throws Exception {
        if(name.equals(""))
            JOptionPane.showMessageDialog(null, "Name cannot is empty", "ERROR", JOptionPane.WARNING_MESSAGE);
        else {
            UniService.getInstance().save(new unientity().setName(name).setCode(code).setunit(unit).setcapacity(capacity));
            UniRegistration.jFrame.dispose();
            JOptionPane.showMessageDialog(null, "Register successfully");
        }
    }

    public void update(String name, int code, String capacity, int unit) throws Exception {
        if(name.equals(""))
            JOptionPane.showMessageDialog(null, "Name cannot is empty", "ERROR", JOptionPane.WARNING_MESSAGE);
        else {
            if (select(code)) {
                UniService.getInstance().edit(new unientity().setName(name).setCode(code).setcapacity(capacity).setunit(unit));
                UniEdit.jFrame.dispose();
                JOptionPane.showMessageDialog(null, "Edit successfully");
            } else
                JOptionPane.showMessageDialog(null, "Invalid Code", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void delete(int code) throws Exception {
        if(select(code)) {
            UniService.getInstance().remove(code);
            UniDelete.jFrame.dispose();
            JOptionPane.showMessageDialog(null, "Delete successfully");
        } else
            JOptionPane.showMessageDialog(null, "Invalid Code", "ERROR", JOptionPane.WARNING_MESSAGE);
    }

    public boolean select(int code) throws Exception {
        boolean check = false;
        List<unientity> unientityList = UniService.getInstance().report();
        for (unientity unientity : unientityList) {
            if(code == unientity.getCode()) {
                check = true;
                break;
            }
        }
        return check;
    }
}
