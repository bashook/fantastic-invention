package name.bashook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.ZonedDateTime;

@Path("test")
public class DatetimeResource {

    private final static Logger LOGGER = LoggerFactory.getLogger(DatetimeResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response readMessage() {
        System.out.println(ZonedDateTime.now().toString());
        LOGGER.info("I'm logging this.");
        return Response.status(200).entity("getUser is called").build();

    }

    @Path("more")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response write() {
        System.out.println(ZonedDateTime.now().toString());
        LOGGER.info("I'm logging this.2");
        return Response.status(200).entity("getUser is called2").build();

    }

}