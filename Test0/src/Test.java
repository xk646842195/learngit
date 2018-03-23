import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JSONArray;

public class Test {
	public static void main(String[] args) {
		JSONArray ja = new JSONArray();
		ja.add("a1");
		ja.add("a2");
		ja.add("a3");
		ja.add("a4");
		ja.add("a5");
		ja.add("a6");
		ja.add("a7");
		ja.add("a8");
		ja.add("a9");
		ja.add("a10");
		System.out.println(ja);
		int i = ja.size();
		JSONArray ja1 = new JSONArray();
		if (i>20) {
			for (int j = 0; j < ja.size(); j++) {
				ja1.add(ja.get(j));
			}
		}else {
			for (int j = i/2; j < ja.size(); j++) {
				ja1.add(ja.get(j));
			}
			for (int j = 0; j < i/2; j++) {
				ja1.add(ja.get(j));
			}
		}
		System.out.println(ja1);
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("HH");
		System.out.println(sf.format(date));
	}
}
