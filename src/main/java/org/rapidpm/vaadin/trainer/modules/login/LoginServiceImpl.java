package org.rapidpm.vaadin.trainer.modules.login;

import java.util.Objects;
import java.util.Optional;

import org.rapidpm.vaadin.trainer.api.LoginService;
import org.rapidpm.vaadin.trainer.api.User;

/**
 *
 */
public class LoginServiceImpl implements LoginService {

  @Override
  public boolean check(String login, String password) {
    return ! Objects.isNull(login) && ! Objects.isNull(password)
           && (
               (login.equals("admin") && password.equals("admin"))
               || (login.equals("max") && password.equals("max"))

           );
  }

  @Override
  public Optional<User> loadUser(String login) {
    if(login.equals("admin")) return Optional.of(new User().login("admin").foreName("Admin").familyName("Secure"));
    if(login.equals("max")) return Optional.of(new User().login("max").foreName("Max").familyName("Rimkus"));
    return Optional.empty();
  }


}
