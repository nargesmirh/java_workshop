package com.company.model.Card;

import com.company.model.Driver.DriverEntity;
import com.company.model.Driver.DriverRepository;
import com.company.model.Driver.DriverService;

import java.util.List;

public class CardService {
    private CardService() {}
    private static CardService cardService=new CardService();
    public static CardService getInstance() {
        return cardService;
    }
    public void edit(CardEntity cardEntity)throws Exception{
        try (CardRepository cardRepository=new CardRepository()){
            cardRepository.update(cardEntity);
            cardRepository.commit();
        }
    }
    public long report(CardEntity cardEntity) throws Exception {
        long inventory;
        try (CardRepository cardRepository=new CardRepository()) {
            inventory = cardRepository.report(cardEntity);
        }
        return inventory;
    }
}
