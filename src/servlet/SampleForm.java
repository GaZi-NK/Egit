package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SampleForm")
public class SampleForm extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String category = request.getParameter("qtype");
		String kaigyo_code = System.getProperty("line.separator");
		String[] stringArray = request.getParameter("body").split(kaigyo_code);

		//リクエストパラメータをチェック
		switch(category) {
		case "company":
			category = "会社について";
			break;

		case "product":
			category = "製品について";
			break;

		case "support":
			category = "カスタマーサポートについて";
			break;
		default:
			category = "categoryを選択してください";
		}



		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + name + "<br>" + category +"</p>");
		for(int i = 0; i < stringArray.length; i++) {
			out.println(stringArray[i]);
		}
		out.println("</body>");
		out.println("</html>");


	}

}
