package krabkrab;

import com.sun.net.httpserver.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create();
        server.bind(new InetSocketAddress(5000), 1);
        HttpContext context = server.createContext("/", new ResHandler());
        server.start();
    }

    static class ResHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String str = "metallica!!!xxxxfgfg";
            httpExchange.sendResponseHeaders(200, str.length());
            OutputStream os = httpExchange.getResponseBody();
            os.write(str.getBytes());
            os.close();

        }
    }
}
