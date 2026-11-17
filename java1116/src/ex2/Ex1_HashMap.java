package ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex1_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("z", 100);
        map.put("a", 99);
        map.put("d", 80);
        map.put("c", 80);
        map.put("f", 70);
        System.out.println("Map size: " + map.size());
        System.out.println("Map get(key): " + map.get("f"));
        
        map.put("8", 80);
        map.put("f", 100);
        System.out.println("Map size: " + map.size());
        System.out.println("Map get(key): " + map.get("f"));
        
        System.out.println("-----Iterator------");
        java.util.Set<Entry<String, Integer>> me;
		Object Set = me = map.entrySet();
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