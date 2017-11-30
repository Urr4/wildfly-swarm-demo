package de.urr4.wildflyswarmdemo.resources;

import de.urr4.wildflyswarmdemo.entities.User;
import de.urr4.wildflyswarmdemo.services.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Resource to test REST-Services
 */
@ApplicationScoped
@Path("/users")
public class UserResource {

    @Inject
    private UserService userService;

    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("userId") Long userId){
        User user = userService.getUserById(userId);
        return user;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Long saveUser(User user){
        Long userId = userService.saveUser(user);
        return userId;
    }
}
