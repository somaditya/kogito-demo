package com.amdocs.kogito.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.amdocs.kogito.model.User;

@Path("/api/user")
@RegisterRestClient
public interface UsersRemoteService {

    @GET
    @Path("/{id}")
    @Produces("application/json")
    User get(@PathParam("id") Integer id);
    
    @PUT
    @Consumes("application/json")
    void add(@RequestBody User user);
}