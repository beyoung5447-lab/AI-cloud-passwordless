package ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Ex5_Lambda_Collection_Sort")
public class Ex5_Lambda_Collection_Sort extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Integer> scores = new ArrayList<>(List.of(70, 80, 90));
		scores.add(60);
		Collections.sort(scores);
		for (Integer e : scores) {
			System.out.print(e + "");
		}
		System.out.println("");
		System.out.println("--------------");
		Collections.sort(scores, Collections.reverseOrder());
		scores.forEach(e -> System.out.print(e + ""));
	}
}