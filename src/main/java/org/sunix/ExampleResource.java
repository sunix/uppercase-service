package org.sunix;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/touppercase")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String toUpperCase(@QueryParam("p") String p) {
        return p.toUpperCase();
    }
}