package homework;

import java.util.*;

public class HW1_MyLotto_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset = new HashSet<Integer>();
		int c = 0, rand;
		for (int i = 0; i < 6; i++) {
			while (true) {
				rand = (int) (Math.random() * 49) + 1;
				if (hset.add(rand)) {
					break;					
				}
			}
		}
		System.out.println("hset values = " + hset);
	}
}
