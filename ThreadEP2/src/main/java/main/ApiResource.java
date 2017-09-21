/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author MartinLodahl
 */
@Path("group")
public class ApiResource {

    Tester t1 = new Tester();
    List<Group> groups = new ArrayList();
    Deleter d1;
    @Context
    private UriInfo context;

    public ApiResource() {
        d1 = new Deleter(this);
    }

    /**
     * Retrieves representation of an instance of main.ApiResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() throws Exception {
        //TODO return proper representation object
        if (groups.isEmpty()){
            groups = t1.getData();
        }
        return new Gson().toJson(groups);
    }

    /**
     * PUT method for updating or creating an instance of ApiResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
