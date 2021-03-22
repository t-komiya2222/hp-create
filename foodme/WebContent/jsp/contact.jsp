<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact | Foodme</title>
</head>
<link rel="stylesheet" href="./../css/style.css">
<body>

<% request.setCharacterEncoding("UTF-8"); %>

	<header class="site-header">
		<h1 class="site-name">
			<a>Foodme</a>
		</h1>
		<div>
			<nav class="nav">
				<ul class="nav__wrapper">
					<li class="nav__item"><a href="foodmetop.jsp">Top</a></li>
					<li class="nav__item"><a href="aboutpage.jsp">About</a></li>
					<li class="nav__item"><a href="menusearch.jsp">Search</a></li>
					<li class="nav__item"><a href="contact.jsp">Contact</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<div id="wrapper">
		<div id="body">
			<div id="content">
				<div id="contentheader">
					<h1>お問い合わせ</h1></div>

					<div id="contactbox">
						<p class="contactmessage">
							ご意見、要望は下記よりお問い合わせください。<br> コンテンツの内容への個人的な質問は受け付けておりません。<br>
							いただいてもご回答できませんのでご了承ください。
						</p>

						<form action="/foodme/Contact" method="post">
						<input type ="hidden" name="_to" value="">
						<input type ="hidden" name="_subject" value="test">
						<input type ="hidden" name="_from" value="foodme.contact">

							<table class="contacttable">
								<tbody>
									<tr>
										<th>お名前</th>
										<td><input type="text" name="username" value=""></td>
									</tr>
									<tr>
										<th>メールアドレス</th>
										<td><input type="text" name="usermailaddress" value=""></td>
									</tr>
									<tr>
										<th>お問い合わせの種類</th>
										<td><select name="usercontactselect">
												<option value="content">掲載情報について</option>
												<option value="opinion">ご意見</option>
												<option value="other">その他</option>
										</select></td>
									</tr>
									<tr>
										<th>お問い合わせ内容</th>
										<td><textarea name="usercontact" cols="40" rows="10"></textarea></td>
									</tr>

								</tbody>
							</table>
						<div id="contactbuttonwrapper">
							<p class ="button">
								<input class="contactbutton" type="submit" value="送信">
							</p>
							</div>
						</form>
					</div>
			</div>
		</div>
	</div>

</body>
</html>