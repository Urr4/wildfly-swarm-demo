package de.urr4.wildflyswarmdemo.services;

import de.urr4.wildflyswarmdemo.entities.User;

/**
 * User Service Interface to test CDI
 */
public interface UserService {

    User getUserById(Long userId);

    Long saveUser(User user);

}
