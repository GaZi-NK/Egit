package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FowardorRedirected")
public class FowardorRedirected extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n = (int)(Math.random() * 9.9);
		int m = n % 2;

		switch(m) {
		case 0:
			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/forwarded.jsp");
			dispatcher.forward(request, response);
			break;
		case 1:
			//リダイレクト
			response.sendRedirect("/example/redirected.jsp");
		}
	}

}
