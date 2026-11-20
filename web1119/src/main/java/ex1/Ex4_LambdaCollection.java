package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Ex4_LambdaCollection")
public class Ex4_LambdaCollection extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");

        List<String> names = new ArrayList<String>();
        names.add("테스형");
        names.add("철수형");
        names.add("영희형");
        names.add("추가님");
        for (String e : names) {
            out.println("<p>" + e + "</p>");
        }
        out.println("<hr>");
        out.println("<h2>List.of</h2>");
     
        List<String> names2 = List.of("테스형", "철수형", "영희님");
        
        for (String e : names2) {
            out.println("<p>" + e + "</p>");
        }
        out.println("<h3>list.foreach( e -> ) </h3>");
       
        names2.forEach(name -> out.println("<p>" + name + "</p>"));
        req.setAttribute("names2", names2);
        RequestDispatcher rd=req.getRequestDispatcher("ex4_lambda.jsp");
        rd.forward(req,resp);
    }

}