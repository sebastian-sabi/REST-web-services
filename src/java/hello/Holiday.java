package hello;

import hello.model.Destination;
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

    public static Destination LANZAROTTE = new Destination("Spain", "Lanzarotte", "Grand Teguise Resort", "* * * *", "Yes", "Euro","* * *   V" ); 

    
        @GET
    @Path("lanzarotte")
    @Produces({ "application/json" })    
    public JsonObject getLanzarotte(){
        Destination lanzarotte =  LANZAROTTE;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", lanzarotte.getCountry());
        builder.add("place", lanzarotte.getPlace());
        builder.add("hotel", lanzarotte.getHotel());
        builder.add("rating", lanzarotte.getRating());
        builder.add("pool", lanzarotte.getPool());
        builder.add("currency", lanzarotte.getCurrency());
        builder.add("restaurant", lanzarotte.getRestaurant());

        return builder.build();
    }
   
    public static Destination GRAN_CANARIA = new Destination("Spain", "Gran Canaria", "Lopesan Villa del Conde Resort", "* * * *", "Yes", "Euro","* * *   V" ); 

    @GET
    @Path("granCanaria")
    @Produces({ "application/json" })    
    public JsonObject getGranCanaria(){
        Destination tourist =  GRAN_CANARIA;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
     public static Destination MIAMI = new Destination("USA", "Miami", "Fortune House Hotel", "* * * *", "Yes", "US DOLLAR","* * *   V" ); 

    @GET
    @Path("miami")
    @Produces({ "application/json" })    
    public JsonObject getMiami(){
        Destination tourist =  MIAMI;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
    public static Destination BAHAMAS = new Destination("USA", "Bahamas", "Bay View Suites Paradise Island", "* * * *", "Yes", "US DOLLAR","* * *   V" ); 

    @GET
    @Path("bahamas")
    @Produces({ "application/json" })    
    public JsonObject getBahamas(){
        Destination tourist =  BAHAMAS;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
    public static Destination FUERTEVENTURA = new Destination("Spain", "Fuerteventura", "Elba Carlota Beach Convention Resort", "* * * *", "Yes", "EURO","* * *   V" ); 

    @GET
    @Path("fuerteventura")
    @Produces({ "application/json" })    
    public JsonObject getFuerteventura(){
        Destination tourist =  FUERTEVENTURA;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
        public static Destination HAWAII = new Destination("USA", "Hawaii", "Four Seasons Resort Hualalai", "* * * *", "Yes", "US DOLLAR","* * *   V" ); 

    @GET
    @Path("hawaii")
    @Produces({ "application/json" })    
    public JsonObject getHawaii(){
        Destination tourist =  HAWAII;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
    public static Destination VIETNAM = new Destination("Vietnam", "Baya", "Bayan Tree Resort", "* * * *", "Yes", "DONG", "* * *   V" ); 

    @GET
    @Path("vietnam")
    @Produces({ "application/json" })    
    public JsonObject getVietnam(){
        Destination tourist =  VIETNAM;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
    public static Destination SRI_LANKA = new Destination("Vietnam", "Baya", "Bayan Tree Resort", "* * * *", "Yes", "DONG", "* * *   V" ); 

    @GET
    @Path("sri_lanka")
    @Produces({ "application/json" })    
    public JsonObject getSriLanka(){
        Destination tourist =  SRI_LANKA;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
        
    public static Destination AUSTRALIA = new Destination("Australia", "Melbourne", "Lizard Resort", "* * * *", "Yes", "AUS DOLLAR", "* * *   V" ); 

    @GET
    @Path("australia")
    @Produces({ "application/json" })    
    public JsonObject getAustralia(){
        Destination tourist =  AUSTRALIA;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
        public static Destination INDIA = new Destination("INDIA", "Bombay", "Fariyas Resort", "* * * *", "Yes", "RUPI", "* * *   V" ); 

    @GET
    @Path("india")
    @Produces({ "application/json" })    
    public JsonObject getIndia(){
        Destination tourist =  INDIA;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
            public static Destination GRAND_CANYON = new Destination("USA", "Grand Canyon", "Grand Canyon Resort", "* * * *", "Yes", "US DOLLAR", "* * *   V" ); 

    @GET
    @Path("grand_canyon")
    @Produces({ "application/json" })    
    public JsonObject getGrandCanyon(){
        Destination tourist =  GRAND_CANYON;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
    public static Destination ATLANTA_CITY = new Destination("USA", "Atlanta city", "Ocean Resort", "* * * *", "Yes", "US DOLLAR", "* * *   V" ); 

    @GET
    @Path("atlanta_city")
    @Produces({ "application/json" })    
    public JsonObject getAtlantaCity(){
        Destination tourist =  ATLANTA_CITY;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
     public static Destination SWITZERLAND = new Destination("Switzerland", "Zermatterhof", "Grand Hotel Zermatterhof", "* * * * *", "Yes", "SWISS FRANK", "* * *   V" ); 

    @GET
    @Path("switzerland")
    @Produces({ "application/json" })    
    public JsonObject getSwitzerland(){
        Destination tourist =  SWITZERLAND;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
     public static Destination AUSTRIA = new Destination("Austria", "Alpbach Ski Resort", "Grand Hotel Zermatterhof", "* * * *", "Yes", "EURO", "* * *   V" ); 

    @GET
    @Path("austria")
    @Produces({ "application/json" })    
    public JsonObject getAustria(){
        Destination tourist =  AUSTRIA;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
     public static Destination FRANCE = new Destination("France", "Les Arcs", "Les Trois Valleesf", "* * * *", "Yes", "EURO", "* * *   V" ); 

    @GET
    @Path("france")
    @Produces({ "application/json" })    
    public JsonObject getFrance(){
        Destination tourist =  FRANCE;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
         public static Destination ITALY = new Destination("Italy", "Kronplatz", "Passo Tonale", "* * *", "Yes", "EURO", "* *    V" ); 

    @GET
    @Path("italy")
    @Produces({ "application/json" })    
    public JsonObject getItaly(){
        Destination tourist =  ITALY;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
         public static Destination NORWAY = new Destination("Norway", "Vaset", "Homsedal", "* * * * *", "Yes", "NORWEGIAN KRONA", "* * *    V" ); 

    @GET
    @Path("norway")
    @Produces({ "application/json" })    
    public JsonObject getNorway(){
        Destination tourist =  NORWAY;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
         public static Destination SWEDEN = new Destination("Sweden", "Branas", "Gävleborg", "* * * *", "Yes", "SWEDISH KRONA", "* * *    V" ); 

    @GET
    @Path("sweden")
    @Produces({ "application/json" })    
    public JsonObject getSweden(){
        Destination tourist =  SWEDEN;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("country", tourist.getCountry());
        builder.add("place", tourist.getPlace());
        builder.add("hotel", tourist.getHotel());
        builder.add("rating", tourist.getRating());
        builder.add("pool", tourist.getPool());
        builder.add("currency", tourist.getCurrency());
        builder.add("restaurant", tourist.getRestaurant());

        return builder.build();
    }
    
    
    
    
    
    
    
}
