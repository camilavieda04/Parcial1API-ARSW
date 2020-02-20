package edu.eci.arsw.exams.moneylaunderingapi.model;

public class SuspectAccount {
    public String accountId;
    public int amountOfSmallTransactions;
    
    public SuspectAccount(){
        
    }
    
    public String getAccountId(){
        return accountId;
    }
    
    public int getAmountofSmallTransactions(){
        return amountOfSmallTransactions;
    }
    
    public void setAccountId( String accountId )
    {
        this.accountId = accountId;
    }
     
    public void setAmountofSmallTransactions( int amountOfSmallTransactions )
    {
        this.amountOfSmallTransactions = amountOfSmallTransactions;
    }
}
