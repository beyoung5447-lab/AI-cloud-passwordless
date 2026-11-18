package ex4;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Ex2_Lambda")
public class Ex2_Lambda extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calculator cal = new Calculator() {

            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        int res = cal.calculate(10, 20);
        System.out.println(res);
        System.out.println("**");
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println(add.calculate(3, 4));
        System.out.println(multiply.calculate(3, 4));
        multiply.test1();
    }
}