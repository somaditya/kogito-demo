package com.amdocs.kogito.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.amdocs.kogito.model.User;

@Path("/users")
@RegisterRestClient
public interface UsersRemoteService {

    @GET
    @Path("/{id}")
    @Produces("application/json")
    User get(@PathParam("id") String id);
    
}