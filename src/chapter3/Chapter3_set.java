package chapter3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter3_set {
	public static void main(String[] args) {
		// HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();
		// LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		// 要素を追加する
		set1.add("スイカ");
		set1.add("メロン");
		// 存在チェック (trueを返す)
		System.out.println(set1.contains("スイカ"));
		// 存在チェック (falseを返す)
		System.err.println(set1.contains("なし"));
		// 2を返す
		System.err.println(set1.size());
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		set1.remove("スイカ");
		set1.remove("なし"); // 何もしない
		System.out.println(set1);
	}
}
