package moles.project.base.services;

import moles.project.base.entities.Account;
import moles.project.base.entities.Group;
import moles.project.base.entities.Role;
import moles.project.base.json.UserWithRoles;
import moles.project.base.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @author michal.oles
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    /**
     *
     * @return user roles
     */
    public UserWithRoles getUserWithRoles(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Account account=accountRepository.findOneByLogin(auth.getName());
        List<String> roles=null;
        String login=null;
        if(account!=null){
            login=account.getLogin();
            roles=extractRoles(account);
        }
        UserWithRoles userWithRoles=new UserWithRoles(login,roles);
        return userWithRoles;
    }

    /**
     *
     * @param account account
     * @return roles
     */
    private List<String> extractRoles(Account account){
        List<String> result=new LinkedList<>();
        if(account!=null&& account.getGroup()!=null){
            for (Role r:account.getGroup().getRoles()){
                result.add(r.getName());
            }
        }
        return result;
    }
}
