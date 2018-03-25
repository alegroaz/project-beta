/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecieverService;

import javax.jws.WebService;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author alegr
 */
@Path("authenticate")
public class Authenticate {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Authenticate
     */
    public Authenticate() {
    }

    /**
     * Retrieves representation of an instance of RecieverService.Authenticate
     * @return an instance of java.lang.String
     */
    @GET
    
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        String query = "";
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of Authenticate
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String postJson(String params) {
        
        System.out.println("Ciao");
        
        return "grazie mona";
    }
}
