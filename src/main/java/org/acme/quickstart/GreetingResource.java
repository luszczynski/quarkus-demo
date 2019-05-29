package org.acme.quickstart;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.greetingService.greeting("customer");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/serverinfo")
    public String serverInfo(@Context HttpServletRequest req) {
        return "hello from quarkus running at: "
            + req.getServerName() + " - " +  req.getLocalAddr();
    }
}