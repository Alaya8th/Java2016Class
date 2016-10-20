package homework;

import java.util.*;

public class HW1_OdiseLotto_HastSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset = new HashSet<>();
		while (hset.size() != 6) {
			int getNum = getRandom();
			//System.out.println(hset.add(getNum) ? getNum : "Repeat");
			System.out.println(hset.add(getNum) ? getNum : "");
		}

		// for (Integer integer : hset) {
		// System.out.println(integer);
		// }
	}

	public static int getRandom() {
		return (int) (Math.random() * 49) + 1;
	}
}
