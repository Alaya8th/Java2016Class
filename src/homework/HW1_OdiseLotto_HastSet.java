package homework;

import java.util.*;

public class HW1_OdiseLotto_HastSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset = new HashSet<Integer>();
		while (hset.size() != 7) {
			hset.add(getRandom());
		}

		for (Integer integer : hset) {
			System.out.println(integer);
		}			
	}

	public static int getRandom() {
		return (int) (Math.random() * 49) + 1;
	}
}
