package main.java.com.consultec.academy.bancoservices.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Path("/hello-world")
public class HelloResource {

    private static final Logger log = LoggerFactory.getLogger(HelloResource.class);

    @GET
    @Produces("application/json")
    public String hello() {
        log.debug("MENSAJE DEBUG");
        log.error("MENSAJE ERROR");
        log.warn("MENSAJE WARN");
        log.info("MENSAJE INFO");
        return "Hello, World!";
    }
}