package com.company.model.Card;

public class CardEntity {
    private String cardPassword,cardNumber,id;
    private long inventory;


    public String getCardNumber() {
        return cardNumber;
    }

    public CardEntity setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public CardEntity setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
        return this;
    }

    public String getId() {
        return id;
    }

    public CardEntity setId(String id) {
        this.id = id;
        return this;
    }

    public long getInventory() {
        return inventory;
    }

    public CardEntity setInventory(long inventory) {
        this.inventory = inventory;
        return this;
    }
}
