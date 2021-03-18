package foodme;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetFood {
	//取得した値を基に、SQL文でfoodphaseに対応する料理を取得してくる
	public static ArrayList<UserBean> getfoodprocess(String foodphase, java.sql.Connection conn,
			ArrayList<UserBean> beanList, String getcategoly) {

		getfoodsqlprocess(Integer.parseInt(foodphase), conn, beanList, getcategoly);
		return beanList;
	}

	//Mysql上のテーブルから該当したレコードを抽出してくる
	public static void getfoodsqlprocess(int foodphase, java.sql.Connection conn, ArrayList<UserBean> beanList,
			String getcategoly) {
		try {
			String sql = null;
			PreparedStatement pstmt;

			getcategoly = Getcategolychange.getcategolyhash(getcategoly);

			//getcategolyの和食、洋食等のカテゴリーによってsqlの分岐
			switch (getcategoly) {
			case "NO":
				sql = "SELECT * FROM food Where food_phase=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, foodphase);
				break;

			default:
				sql = "SELECT * FROM food Where food_phase = ? and food_categoly = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, foodphase);
				pstmt.setString(2, getcategoly);
			}

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				UserBean bean = new UserBean();

				bean.setFood_id(rs.getInt("food_id"));
				bean.setFood_name(rs.getString("food_name"));
				bean.setFood_categoly(rs.getString("food_categoly"));
				bean.setFood_calorie(rs.getInt("food_calorie"));
				bean.setFood_country(rs.getString("food_country"));

				// データを保存した bean を beanList に追加
				beanList.add(bean);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}


}