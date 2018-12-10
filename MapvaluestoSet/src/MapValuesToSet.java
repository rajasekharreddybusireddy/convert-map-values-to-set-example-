import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapValuesToSet {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "abc");
		hashMap.put(2, "def");
		hashMap.put(3, "ghi");
		hashMap.put(4, "jkl");
		hashMap.put(5, "mno");

		MapValuesToSet obj = new MapValuesToSet();
		Set<String> valuesToSet = obj.mapValuesToSet(hashMap);
		valuesToSet.forEach(System.out::println);

	}

	public Set<String> mapValuesToSet(Map<Integer, String> map) {

		Collection<String> values = map.values();
		HashSet<String> hashSet = new HashSet<>(values);
		return hashSet;

	}

}
