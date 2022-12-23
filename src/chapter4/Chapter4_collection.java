package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Chapter4_collection {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		items.add("bag"); // OK
		// これ以下はString型ではない要素を追加しているのでコンパイルエラー
		//items.add(0);
		//items.add(true);
		
		String item = items.get(0); // OK
		// これ以下はString型ではない変数に代入しているのでコンパイルエラー
		//int item = items.get(0);
		//boolean item = items.get(0);
		System.out.println(item);
		
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); // OK
		//set.add("Two"); // コンパイルエラー

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		//int value = map.get(0); // コンパイルエラー
	}
}
