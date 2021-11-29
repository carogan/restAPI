package ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("demo")
public class DemoRest {

	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return ("Hello World");
	}
}
