package foodme;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Foodmemain
 */
@WebServlet("/Foodmemain")
public class Foodmemain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Foodmemain() {
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

		//接続情報定義
		Connection conn = null;
		String url = "jdbc:mysql://localhost/mydb";
		String user = "root";
		String password = "mainuser";

		//ユーザ入力パラメータの取得
		String getcategoly = request.getParameter("categoly");
		String getappetizer = request.getParameter("appetizer");
		String getsidedish = request.getParameter("sidedish");
		String getmaindish = request.getParameter("maindish");
		String getdessert = request.getParameter("dessert");

		//変数,配列定義
		ArrayList<String> getuserparameter = new ArrayList<String>();

		//NULLかどうかの判定で使用
		getuserparameter.add(getappetizer);
		getuserparameter.add(getsidedish);
		getuserparameter.add(getmaindish);
		getuserparameter.add(getdessert);

		// beanList を生成
		ArrayList<UserBean> beanList = new ArrayList<UserBean>();

		try {
			// JDBC ドライバを読み込み
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);


				//ユーザー入力値の判定、値を渡す
				for(int i = 0; i <= 3;i++) {
					if(null != getuserparameter.get(i)) {
						GetFood.getfoodprocess(getuserparameter.get(i), conn,beanList,getcategoly);
					}
				}

		} catch (ClassNotFoundException e) {
			// 例外処理
			e.printStackTrace();
		} catch (SQLException e) {
			// 例外処理
			e.printStackTrace();
		} catch (Exception e) {
			// 例外処理
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// 例外処理
				e.printStackTrace();
			}
		}

		// beanList をリクエストにセット
		request.setAttribute("beanList", beanList);

		//コンテンツタイプの設定
		response.setContentType("text/html; charset=UTF-8");

		//画面出力
//		request.setAttribute("getcalorie", getcalorie);
		request.setAttribute("getappetizer", getappetizer);
		request.setAttribute("getsidedish", getsidedish);
		request.setAttribute("getmaindish", getmaindish);
		request.setAttribute("getdessert", getdessert);

		// リダイレクト
		ServletContext context = this.getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/jsp/searchresult.jsp");
		dispatcher.forward(request, response);

	}
}
