package moles.project.base.json;

import java.util.List;

/**
 * @author michal.oles
 */
public class UserWithRoles {
    List<String> roles;
    String login;

    public UserWithRoles() {
    }

    /**
     *
     * @param roles roles
     * @param login login name
     */
    public UserWithRoles(String login,List<String> roles) {
        this.roles = roles;
        this.login = login;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
