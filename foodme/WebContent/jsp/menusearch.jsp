<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menusearch | Foodme</title>
</head>
<link rel="stylesheet" href="./../css/style.css" />
<body>
	<!-- ヘッダー部の挙動確認で実装 -->
	<!-- ここから -->
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
	<!-- ここまで -->

	<div id="wrapper">
		<div id="body">
			<div id="content">
				<div id="contentheader">
					<h1>メニュー検索</h1>
				</div>
				<div id="searchbox">
					<div class="searchinner">
						<p class="searchheader">検索条件を指定してください。<span>*</span>の項目は1個以上選択してください。</p>
						<form method="post" action="/foodme/Foodmemain">
							<table class="searchtable">
								<tbody>
									<tr id="keyword">
										<th>キーワード</th>
										<td><input type="text" name="keyword" value=""
											placeholder="キーワードを入力" maxlength="256"></td>
									</tr>

									<tr id="categoly">
										<th>カテゴリー</th>
										<td><select name="categoly">
												<option value="NO">指定なし</option>
												<option value="japan">日本料理</option>
												<option value="america">アメリカ料理</option>
												<option value="russian">ロシア料理</option>
												<option value="british">イギリス料理</option>
												<option value="espana">スペイン料理</option>
												<optgroup label="地中海料理">
													<option value="morocco">モロッコ料理</option>
													<option value="itaria">イタリア料理</option>
												</optgroup>
										</select></td>
									</tr>

									<tr>
										<th>アペタイザー<span>*</span></th>
										<td><input type="checkbox" name="appetizer" value="1">
										</td>
									</tr>

									<tr>
										<th>サイド ディッシュ<span>*</span></th>
										<td><input type="checkbox" name="sidedish" value="2">
										</td>
									</tr>

									<tr>
										<th>メイン ディッシュ<span>*</span></th>
										<td><input type="checkbox" name="maindish" value="3">
										</td>
									</tr>

									<tr>
										<th>デザート<span>*</span></th>
										<td><input type="checkbox" name="dessert" value="4">
										</td>
									</tr>
								</tbody>
							</table>
							<div class="buttonwrapper">
								<p class="button">
									<input class="resetbuton" type="reset" value="リセット">
								</p>
								<p class="button">
									<input class="searchbutton" type="submit" value="料理を検索">
								</p>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>