package ex3;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex1_param")
public class FormServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        req.setCharacterEncoding("UTF-8");
       
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age")); 
        String order = req.getParameter("order");
        
        
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("order: " + order);
    }
}