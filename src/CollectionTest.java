import java.util.HashMap;


public class CollectionTest {
	public static void main(String[] args) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		h.put(10, 110);
		Integer res = h.get(20);
		System.out.println(res);
	}
}
