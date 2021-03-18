<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="foodme.UserBean"%>
<%
	ArrayList<UserBean> beanList = (ArrayList<UserBean>) request.getAttribute("beanList");
%>
<%
	request.setCharacterEncoding("UTF-8");
//int getcalorie = ((Integer) (request.getAttribute("getcalorie"))).intValue();
String getappetizer = (String) request.getAttribute("getappetizer");
String getsidedish = (String) request.getAttribute("getsidedish");
String getmaindish = (String) request.getAttribute("getmaindish");
String getdessert = (String) request.getAttribute("getdessert");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Searchresult | Foodme</title>
<link rel="stylesheet" href="././css/style.css">
</head>
<body>

	<header class="site-header">
		<h1 class="site-name">
			<a>Foodme</a>
		</h1>
		<div>
			<nav class="nav">
				<ul class="nav__wrapper">
					<li class="nav__item"><a href="jsp/foodmetop.jsp">Top</a></li>
					<li class="nav__item"><a href="jsp/aboutpage.jsp">About</a></li>
					<li class="nav__item"><a href="jsp/menusearch.jsp">Search</a></li>
					<li class="nav__item"><a href="jsp/contact.jsp">Contact</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<!-- 検索結果表示の為の記述 -->
	<div id="wrapper">
		<div id="body">
			<div id="content">
				<div id="contentheader">
					<h1>検索結果</h1>
				</div>
				<div id="searchbox">
					<div id="searchresultwrapper">
						<div id="searchcategolymenu">
							<table id="searchcategolytable">
								<tbody>
									<tr>
										<th class="select">セレクト</th>
										<th>アペタイザー</th>
										<th>サイド ディッシュ</th>
										<th>メイン ディッシュ</th>
										<th>デザート</th>
									</tr>
								</tbody>
							</table>
						</div>
						<div id="searchresultcontainer">
							<table id="resulttable">
								<tbody>
									<tr>
										<th>料理名</th>
										<th>カテゴリー</th>
										<th>カロリー</th>
										<th>発祥国</th>
									</tr>
									<%
										for (UserBean bean : beanList) {
									%>
									<tr>
										<td><%=bean.getFood_name()%></td>
										<td><%=bean.getFood_categoly()%></td>
										<td><%=bean.getFood_calorie()%></td>
										<td><%=bean.getFood_country()%></td>
									</tr>
									<%
										} // endfor
									%>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>