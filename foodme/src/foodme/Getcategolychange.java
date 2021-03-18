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
}
