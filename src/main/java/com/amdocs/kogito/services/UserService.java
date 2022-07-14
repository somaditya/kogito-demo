package com.amdocs.kogito.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.amdocs.kogito.model.User;
import com.amdocs.kogito.rest.UsersRemoteService;

@ApplicationScoped
public class UserService {

    @Inject
    @RestClient
    UsersRemoteService usersRemoteService;

    @Fallback(fallbackMethod = "userNotFound")
    public User getUserById(String userId) {
        return usersRemoteService.get(userId);
    }

    public User userNotFound(String userId) {
        return null;
    }
}
