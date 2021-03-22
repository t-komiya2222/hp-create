package foodme;

import java.util.HashMap;

public class Getcategolychange {

	//getcategolyの値をhashmapを用いて対応する値に変換する
	public static String getcategolyhash(String getcategoly) {

		String hashcategoly = null;
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("japan", "日本料理");
		map.put("america", "アメリカ料理");
		map.put("morocco", "モロッコ料理");
		map.put("russian", "ロシア料理");
		map.put("british", "イギリス料理");
		map.put("espana", "スペイン料理");
		map.put("itaria", "イタリア料理");

		if (map.containsKey(getcategoly)) {
			hashcategoly = map.get(getcategoly);
		} else {
			System.out.println("指定したキーは存在しません");
			hashcategoly = "NO";
		}

		return hashcategoly;
	}

	//getfoodnameで対応する画像を持ってくる
	public static String getfoodimage(String getcategolyname) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("塩むすび", "./image/onigiri.jpg");
		map.put("ホットアップルパイ", "./image/applepie.jpg");
		map.put("ボルシチ", "./image/borusiti.jpg");
		map.put("ハンバーガー", "./image/burger.jpg");
		map.put("チキングリルとクスクス", "./image/couscous.jpg");
		map.put("魚介のサルピコン", "./image/gyokainosarupikon.jpg");
		map.put("シーフードパエリア", "./image/paeria.jpg");
		map.put("パスティ", "./image/pasuthi.jpg");
		map.put("サーモンのエスカベッシュ", "./image/samon_esukabesh.jpg");

		getcategolyname = map.get(getcategolyname);

		return getcategolyname;
	}
}
