package org.rapidpm.vaadin.trainer.api;

import java.util.Optional;

/**
 *
 */
public interface LoginService {
  boolean check(String login, String password);

  Optional<User> loadUser(String login);

}
