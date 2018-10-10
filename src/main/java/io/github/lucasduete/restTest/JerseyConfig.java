package io.github.lucasduete.restTest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //Scaneia Dinamicamente pelos Controllers (classes com @Path)
        packages("io.github.lucasduete.controllers");
    }
}