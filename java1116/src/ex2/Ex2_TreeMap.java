package ex2;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;

public class Ex2_TreeMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		NavigableMap<String, Integer> map2 = map1.descendingMap();
		map2.put("z", 100);
		map2.put("a", 99);
		map2.put("d", 80);
		map2.put("c", 80);
		map2.put("f", 70);
		System.out.println("Map size: " + map2.size());
		System.out.println("Map get(key): " + map2.get("f"));
		map2.put("b", 80);
		map2.put("f", 100);
		System.out.println("-----Iterator------");
		java.util.Set<Entry<String, Integer>> me;
		Object Set = me = map2.entrySet();
		java.util.Iterator<Entry<String, Integer>> it;
		Object Iterator = it = me.iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
		}

		System.out.println("----------foreach---------");
		for (Map.Entry<String, Integer> e : me) {
			System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
		}
	}
}
