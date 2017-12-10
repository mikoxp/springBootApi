package moles.project.base.controllers;

import moles.project.base.entities.Account;
import moles.project.base.repositories.AccountRepository;
import moles.project.base.services.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
    /**
     *
     * @return all account
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Account> getAll(){
        logger.info("Get all account");
        return accountService.getAll();
    }
}
