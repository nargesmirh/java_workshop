package com.company.controller;

import com.company.model.Card.CardEntity;
import com.company.model.Card.CardRepository;
import com.company.model.Card.CardService;
import com.company.model.Officer.OfficerService;

public class CardController {
    public String number,password;
    public long invontry1,invontry2;
    public void Cardedit() {
        try {
            CardService.getInstance().edit(new CardEntity().setCardNumber(number).setCardPassword(password).setInventory(invontry1));
        }
        catch (Exception e){
            e.getMessage();
        }

    }
    public long Cardreport(){

        try {
            invontry2=CardService.getInstance().report(new CardEntity().setCardNumber(number));
        }
        catch (Exception e){
            e.getMessage();

        }
        return invontry2;
    }

}
