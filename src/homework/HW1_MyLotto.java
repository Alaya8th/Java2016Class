package homework;

public class HW1_MyLotto {

	public static void main(String[] args) {
		// 105_Java_A �Ǹ� 15 �J�s��_�j�ֳz�@�~09/22
		// �{���֤ߺc�Q�G�H���⦸�üƪ���k���ͼֳz���X�A�W�[�������סC
		// 1. ���ͦ� 100 �� 1~49 �üƪ��}�C
		// 2. �ŧi���i�s�� 7 �� 1~49 ��ƪ��ֳz���X�}�C
		// 3. �C������ 0~99 �������üƧ@���}�C�� index�A�h���o�s��b�� index �̪��üƭȡC
		// 4. �q�� 2 �Ө��o�ֳz���X�}�l�A�C�����|�N�s���쪺�ֳz���X�P�Ҧ��e���w���ͪ��ֳz���X��靈�L���ƭȡC
		// �p���A�h���s���L�s�üơF�Y�L�A�h�N�üƭȩ�J�}�C���A�H�T�O���|���쭫�ƪ��ֳz���X�C
		// 5. ���\���ͨÿ�X 7 �ӨS�����ƪ��j�ֳz���X�C
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
		// System.out.println("�� 1 �Ӥj�ֳz���X�A���� " + randomNum + " �ӭ� �A�Ȭ� : " +
		// arr[randomNum]);

		for (i = 1; i < 7; i++) {

			randomNum = (int) (Math.random() * 99) + 1;
			lotto[i] = arr[randomNum];

			// �N�s���쪺�ֳz���X�P�Ҧ��e���w���ͪ��ֳz���X�ˬd��靈�L���ƭȡC
			// �p���A�h���s���L�s�üơF�Y�L�A�h�N�üƭȩ�J�}�C���A�H�T�O���|���쭫�ƪ��ֳz���X�C
			j = 0;
			do {

				if ((i != j) && (lotto[i] == lotto[j])) {

					// System.out.println("Found replicated�I");
					// System.out.println("i = " + i + " : lotto[" + i + "] = "
					// + lotto[i]);
					// System.out.println("j = " + j + " : lotto[" + j + "] = "
					// + lotto[j]);

					randomNum = (int) (Math.random() * 99) + 1;
					// System.out.println("�A���� " + randomNum + " �ӭ� �A�Ȭ� : " +
					// arr[randomNum]);
					lotto[i] = arr[randomNum];
				}
				j++;
			} while (j < i);
		}

		System.out.println("\nTitle : 105_Java_A_�j�ֳz�@�~_09/22");
		System.out.println("\nAuthor : �Ǹ� 15 �J�s��");
		System.out.println("\n�u���ֺ����v�j�ֳz�}�����X :\n");

		for (i = 0; i < 7; i++) {
			if (i == 6)
				System.out.println("�� " + (i + 1) + " �ӯS�O�� : " + lotto[i] + "\t");
			else
				System.out.println("�� " + (i + 1) + " �Ӥ������X : " + lotto[i] + "\t");
		}

		System.out.println("\n���z�}�ߤ��j��!!");

	}
}
