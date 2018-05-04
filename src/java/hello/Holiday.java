package hello;

import hello.model.Tourist;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

// The Java class will be hosted at the URI path "/helloworld"

@Path("/holiday")
public class Holiday {
    
    // The Java method will process HTTP GET requests

    public static Tourist TOURIST_1 = new Tourist("John", "Wilson", "Ealing, London"); 
    
        @GET
    @Path("tourist")
    @Produces({ "application/json" })    
    public JsonObject getTourist(){
        Tourist tourist =  TOURIST_1;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("firstname", tourist.getFirstname());
        builder.add("lastname", tourist.getLastname());
        builder.add("address", tourist.getAddress());
        return builder.build();
    }
     
    
}
