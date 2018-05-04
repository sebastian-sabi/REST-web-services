package hello;

import hello.model.Student;
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

@Path("/course")
public class UniversityCourse {
    
    // The Java method will process HTTP GET requests

    public static Student SAMPLE_TEST_STUDENT_DATA = new Student("John", "Wilson", "Ealing, London"); 
    
        @GET
    @Path("student")
    @Produces({ "application/json" })    
    public JsonObject getStudent(){
        Student student =  SAMPLE_TEST_STUDENT_DATA;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("firstname", student.getFirstname());
        builder.add("lastname", student.getLastname());
        builder.add("address", student.getAddress());
        return builder.build();
    }
     
    
}
