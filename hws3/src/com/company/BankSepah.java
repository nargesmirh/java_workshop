package com.company;

public class BankSepah extends BankMarkazi{
    public void Loan(){
        System.out.println("**this bank has a very good loan to customer**");
        if(holding>10000){
            System.out.println("loan belong to customer");
        }
        else{
            System.out.println("increas your holding:)");
        }

    }

    @Override
    public void Harvest() {
        super.Harvest();
    }

    @Override
    public void Deposit() {
        super.Deposit();
    }

    @Override
    public void Cashoperations() {
        super.Cashoperations();
    }

    @Override
    public void Transitionoperations() {
        super.Transitionoperations();
    }

    @Override
    public void Cardtocardoperation() {
        super.Cardtocardoperation();
    }

    @Override
    public void Cheque() {
        super.Cheque();
    }
}
