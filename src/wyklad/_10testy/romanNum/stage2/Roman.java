package wyklad._10testy.romanNum.stage2;

import wyklad._10testy.romanNum.Pair;

import java.util.ArrayList;
import java.util.List;

public class Roman {
	private static List<Pair<String, Integer>> romanNumeralPairs = new ArrayList<Pair<String, Integer>>();

	static {
		romanNumeralPairs.add(new Pair<String, Integer>("M", 1000));
		romanNumeralPairs.add(new Pair<String, Integer>("CM", 900));
		romanNumeralPairs.add(new Pair<String, Integer>("D", 500));
		romanNumeralPairs.add(new Pair<String, Integer>("CD", 400));
		romanNumeralPairs.add(new Pair<String, Integer>("C", 100));
		romanNumeralPairs.add(new Pair<String, Integer>("XC", 90));
		romanNumeralPairs.add(new Pair<String, Integer>("L", 50));
		romanNumeralPairs.add(new Pair<String, Integer>("XL", 40));
		romanNumeralPairs.add(new Pair<String, Integer>("X", 10));
		romanNumeralPairs.add(new Pair<String, Integer>("IX", 9));
		romanNumeralPairs.add(new Pair<String, Integer>("V", 5));
		romanNumeralPairs.add(new Pair<String, Integer>("IV", 4));
		romanNumeralPairs.add(new Pair<String, Integer>("I", 1));
	}

	public static String toRoman(int n) {
		String result = "";
		for (Pair<String, Integer> p : romanNumeralPairs) {
			while (n >= p.getR()) {
				result += p.getL();
				n -= p.getR();
			}
		}
		return result;
	}

	public static Integer fromRoman(String r) {
		return -1;
	}

}
