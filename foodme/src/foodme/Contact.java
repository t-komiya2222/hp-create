package foodme;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		//コンテンツタイプの設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		//ユーザ入力パラメータの取得
		String getusername = request.getParameter("username");
		String getusermailaddress = request.getParameter("usermailaddress");
		String getusercontactselect = request.getParameter("usercontactselect");
		String getusercontact = request.getParameter("usercontact");

		//getusercontactselectの値を変換
		switch(getusercontactselect) {
		case"content":
			getusercontactselect ="掲載情報について";
			break;
		case"opinion":
			getusercontactselect ="ご意見";
			break;
		case"other":
			getusercontactselect ="その他";
			break;
		}

		//画面出力
		request.setAttribute("getusername", getusername);
		request.setAttribute("getusermailaddress", getusermailaddress);
		request.setAttribute("getusercontactselect", getusercontactselect);
		request.setAttribute("getusercontact", getusercontact);

		// リダイレクト
		ServletContext context = this.getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/jsp/contactresult.jsp");
		dispatcher.forward(request, response);

	}

}
