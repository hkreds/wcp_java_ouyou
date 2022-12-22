package chapter3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chapter3_list {
	public static void main(String[] args) {
		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();
		// LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();
		// 要素を追加する
		list1.add("りんご");
		list1.add("みかん");
		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");
		// 要素を取得する
		System.out.println(list1.get(0));
		// 存在チェック (trueを返す)
		System.out.println(list1.contains("バナナ"));
		// 存在チェック (falseを返す)
		System.out.println(list1.contains("なし"));
		//3を返す
		System.out.println(list1.size());
		
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		list1.remove("バナナ");
		list1.remove("なし"); // 何もしない
		// 位置を指定して要素を削除する
		list1.remove(0);
		System.out.println(list1);
		
		// Listの例(拡張for文)
		List<String> prefectures = new ArrayList<>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");
		for (String prefecture : prefectures) {
		  System.out.println(prefecture); // 北海道、青森県、秋田県の順に表示
		}
	}
}
