package homework;

public class HW1_MyLotto {

	public static void main(String[] args) {
		// 105_Java_A 學號 15 胡新妤_大樂透作業09/22
		// 程式核心構想：以取兩次亂數的方法產生樂透號碼，增加中獎難度。
		// 1. 產生有 100 個 1~49 亂數的陣列
		// 2. 宣告有可存放 7 個 1~49 整數的樂透號碼陣列
		// 3. 每次產生 0~99 之間的亂數作為陣列的 index，去取得存放在該 index 裡的亂數值。
		// 4. 從第 2 個取得樂透號碼開始，每次都會將新取到的樂透號碼與所有前面已產生的樂透號碼比對有無重複值。
		// 如有，則重新取過新亂數；若無，則將亂數值放入陣列中，以確保不會取到重複的樂透號碼。
		// 5. 成功產生並輸出 7 個沒有重複的大樂透號碼。
		// TODO Auto-generated method stub

		int[] arr = new int[100];
		int[] lotto = new int[7];
		int randomNum, i, j;
		for (i = 0; i < arr.length; i++) {
			randomNum = (int) (Math.random() * 49) + 1;
			arr[i] = randomNum;
			// System.out.print(randomNum + "\t");
		}

		// System.out.println();

		randomNum = (int) (Math.random() * 99) + 1;
		lotto[0] = arr[randomNum];
		// System.out.println("第 1 個大樂透號碼，取第 " + randomNum + " 個值 ，值為 : " +
		// arr[randomNum]);

		for (i = 1; i < 7; i++) {

			randomNum = (int) (Math.random() * 99) + 1;
			lotto[i] = arr[randomNum];

			// 將新取到的樂透號碼與所有前面已產生的樂透號碼檢查比對有無重複值。
			// 如有，則重新取過新亂數；若無，則將亂數值放入陣列中，以確保不會取到重複的樂透號碼。
			j = 0;
			do {

				if ((i != j) && (lotto[i] == lotto[j])) {

					// System.out.println("Found replicated！");
					// System.out.println("i = " + i + " : lotto[" + i + "] = "
					// + lotto[i]);
					// System.out.println("j = " + j + " : lotto[" + j + "] = "
					// + lotto[j]);

					randomNum = (int) (Math.random() * 99) + 1;
					// System.out.println("再取第 " + randomNum + " 個值 ，值為 : " +
					// arr[randomNum]);
					lotto[i] = arr[randomNum];
				}
				j++;
			} while (j < i);
		}

		System.out.println("\nTitle : 105_Java_A_大樂透作業_09/22");
		System.out.println("\nAuthor : 學號 15 胡新妤");
		System.out.println("\n「幸福滿滿」大樂透開獎號碼 :\n");

		for (i = 0; i < 7; i++) {
			if (i == 6)
				System.out.println("第 " + (i + 1) + " 個特別號 : " + lotto[i] + "\t");
			else
				System.out.println("第 " + (i + 1) + " 個中獎號碼 : " + lotto[i] + "\t");
		}

		System.out.println("\n祝您開心中大獎!!");

	}
}
