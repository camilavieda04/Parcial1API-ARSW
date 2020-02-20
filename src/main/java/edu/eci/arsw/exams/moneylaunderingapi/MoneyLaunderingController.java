package edu.eci.arsw.exams.moneylaunderingapi;


import edu.eci.arsw.exams.moneylaunderingapi.model.SuspectAccount;
import edu.eci.arsw.exams.moneylaunderingapi.service.MoneyLaunderingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping( value = "/fraud-bank-accounts")
public class MoneyLaunderingController
{
    
    @Autowired
    MoneyLaunderingService moneyLaunderingService;

   
    @RequestMapping(method=GET)
    public List<SuspectAccount> offendingAccounts() {
        return moneyLaunderingService.getSuspectAccounts();
    }
    
    @RequestMapping(method=POST)
    public ResponseEntity<?> creaCuentaSospechosa(@RequestBody SuspectAccount suspect){
            moneyLaunderingService.updateAccountStatus(suspect);
            return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @RequestMapping(path="/fraud-bank-account/{accountId}",method=GET)
    public SuspectAccount getAccountStatus(@PathVariable("accountId") String accountId){
        return moneyLaunderingService.getAccountStatus(accountId);
    }   
    
    @RequestMapping(path="/fraud-bank-account/{accountId}",method=PUT)
    public ResponseEntity<?> modificarCuentaSospechosa(@PathVariable("accountId") String accountId, @RequestBody SuspectAccount suspect){
            moneyLaunderingService.updateAccountStatus(suspect);
            return new ResponseEntity<>(HttpStatus.CREATED);
    }
}