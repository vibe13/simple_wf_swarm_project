package com.example.demo2.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "value", tags = {"tag"}, hidden = false)
@ApplicationScoped
@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
        @ApiOperation(value = "Display a gentle greeting from WildFly Swarm", response = String.class)
	public Response doGet() {
		return Response.ok("Hello from WildFly Swarm!").build();
	}
}
