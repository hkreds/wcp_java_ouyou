package chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Chapter3_map {
	public static void main(String[] args) {
		// HashMapを生成する場合
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		// TreeMapを生成する場合
		Map<String, String> map2 = new TreeMap<String, String>();
		// 要素を追加する
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		// 登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		// 要素を取得する
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));
		// キーの存在チェック (trueを返す)
		System.out.println(map1.containsKey(0));
		// 値の存在チェック (falseを返す)
		System.out.println(map1.containsValue("ぶどう"));
		//2を返す
		System.out.println(map1.size());
		
		// キーを指定して要素を削除する
		map1.remove(0);
		map1.remove(1); // 何もしない
		// キーと値を指定して要素を削除する
		map1.remove(3, "もも");
		map1.remove(3, "なし"); // 何もしない
		System.out.println(map1);
		
		Map<Integer, String> classmates = new HashMap<>();
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");

		//mapの例(拡張for文)
		// キーのみ
		for (Integer key : classmates.keySet()) {
		  System.out.println(key); // 1, 2, 3の順に表示
		}
		// 値のみ
		for (String name : classmates.values()) {
		  System.out.println(name); // 青木、石坂、小野田の順に表示
		}
		// キーと値のペア
		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
		  System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // 1番は青木さん、2番は石坂さん、3番は小野田さんの順に表示
		}
	}
}
