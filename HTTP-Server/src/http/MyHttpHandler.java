package http;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;

public class MyHttpHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // Handle the incoming request (POST, GET, PUT, DELETE, etc)
        System.out.println("Handling the request");

    }
}