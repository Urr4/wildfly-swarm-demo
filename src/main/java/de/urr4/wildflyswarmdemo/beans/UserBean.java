package de.urr4.wildflyswarmdemo.beans;

import de.urr4.wildflyswarmdemo.entities.User;
import de.urr4.wildflyswarmdemo.services.UserService;
import org.neo4j.ogm.session.Session;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * User Service Implementation to test CDI
 */
@Stateless
public class UserBean implements UserService {

    @Inject
    private Session session;

    @Override
    public User getUserById(Long userId) {
        User user = session.load(User.class, userId);
        return user;
    }

    @Override
    public Long saveUser(User user) {
        session.save(user);
        return user.getId();
    }

}
