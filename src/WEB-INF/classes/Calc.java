package CalcPack;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/hello")
public class Calc extends HttpServlet { 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		             
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
                writer.println("SLAYER!");
        } finally {
                writer.close();  
    	}
    }
}
