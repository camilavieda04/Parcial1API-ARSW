package edu.eci.arsw.exams.moneylaunderingapi.service;

import edu.eci.arsw.exams.moneylaunderingapi.model.SuspectAccount;

import java.util.List;
import org.springframework.stereotype.Service;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class MoneyLaunderingServiceStub implements MoneyLaunderingService {

    List<SuspectAccount> suspectList;

    public MoneyLaunderingServiceStub() {

        suspectList = new CopyOnWriteArrayList<>();

        SuspectAccount suspect1 = new SuspectAccount();
        SuspectAccount suspect2 = new SuspectAccount();
        SuspectAccount suspect3 = new SuspectAccount();
        SuspectAccount suspect4 = new SuspectAccount();
        SuspectAccount suspect5 = new SuspectAccount();
        SuspectAccount suspect6 = new SuspectAccount();

        suspect1.setAccountId("sarah");
        suspect1.setAmountofSmallTransactions(100000);
        suspectList.add(suspect1);

        suspect2.setAccountId("juan");
        suspect2.setAmountofSmallTransactions(1000);
        suspectList.add(suspect2);

        suspect3.setAccountId("andrea");
        suspect3.setAmountofSmallTransactions(800);
        suspectList.add(suspect3);

        suspect4.setAccountId("gerson");
        suspect4.setAmountofSmallTransactions(10000000);
        suspectList.add(suspect4);

        suspect5.setAccountId("sandra");
        suspect5.setAmountofSmallTransactions(700000);
        suspectList.add(suspect5);

        suspect6.setAccountId("jose");
        suspect6.setAmountofSmallTransactions(8000000);
        suspectList.add(suspect6);

    }

    @Override
    public void updateAccountStatus(SuspectAccount suspectAccount) {
       
    }

    @Override
    public SuspectAccount getAccountStatus(String accountId) {
        SuspectAccount resp = null;
        for(SuspectAccount suspect:suspectList){
            if(suspect.getAccountId().equals(accountId)){
                resp=suspect;
            }
        }
        return resp;
    }

    @Override
    public List<SuspectAccount> getSuspectAccounts() {
       return suspectList;
    }
}
