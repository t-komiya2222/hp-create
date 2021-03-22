<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
String getusername = (String) request.getAttribute("getusername");
String getusermailaddress = (String) request.getAttribute("getusermailaddress");
String getusercontactselect = (String) request.getAttribute("getusercontactselect");
String getusercontact = (String) request.getAttribute("getusercontact");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Contact | Foodme</title>
</head>
<link rel="stylesheet" href="././css/style.css">
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

	<div id="wrapper">
		<div id="body">
			<div id="content">
				<div id="contentheader">
					<h1>お問い合わせ</h1>
				</div>

				<div id="contactbox">
					<p class="contactmessage">
						お問い合わせありがとうございます。<br> 下記の内容で送信しました。<br>
						内容を確認の上、回答させていただきます。
					</p>

					<table class="contacttable">
						<tbody>
							<tr>
								<th>お名前</th>
								<td><%=getusername%></td>
							</tr>
							<tr>
								<th>メールアドレス</th>
								<td><%=getusermailaddress%></td>
							</tr>
							<tr>
								<th>お問い合わせの種類</th>
								<td><%=getusercontactselect%></td>
							</tr>
							<tr>
								<th>お問い合わせ内容</th>
								<td><%=getusercontact%></td>
							</tr>

						</tbody>
					</table>

				</div>
			</div>

		</div>
	</div>

</body>
</html>