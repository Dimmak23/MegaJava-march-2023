package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("asd");
		strings.add("hgdfs");
		strings.add("jdfsf");
		strings.add("fgghsdfg");
		strings.add("fghdfbdsgsfdhfg");
		strings.set(1, "Hi");

		strings.forEach(s -> {
			System.out.println(s);
		});
//		strings.forEach(System.out::println);

//		List<String> linkedList = new LinkedList<>();
//		Set<String> linkedList = new TreeSet<>();
//		Map<String, int> mapper = new HashMap<>();

	}
}
