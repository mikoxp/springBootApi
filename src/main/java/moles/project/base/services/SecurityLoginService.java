package moles.project.base.services;

import moles.project.base.entities.Account;
import moles.project.base.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author michal.oles
 */
@Service
public class SecurityLoginService implements UserDetailsService {

    @Autowired
    private AccountRepository accountRepository;

    /**
     *
     * @param username username
     * @return user datailsa
     * @throws UsernameNotFoundException exception
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Account account = accountRepository.findOneByLogin(username);
        if (account == null) {
            throw new UsernameNotFoundException("Not found account");
        }
        return account;
    }

}
