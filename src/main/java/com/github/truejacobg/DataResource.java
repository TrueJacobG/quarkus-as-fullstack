package com.github.truejacobg;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/data")
public class DataResource {

    @Inject
    @Location("data/alpinejs")
    Template alpinejs;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String greet() {
        return alpinejs.render();
    }
}
