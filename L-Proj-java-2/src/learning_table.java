public class learning_table {
	public static void main(String[] args) {
		// 7�� ��������
		int number = 7;

		if (number < 5) {
			System.out.println(number + "��5�����ł�");
		}
		if (number < 10) {
			System.out.println(number + "��10�����ł�");
		}
		if (number < 15) {
			System.out.println(number + "��15�����ł�");
		}
		System.out.println("");

		// else if
		if (number < 5) {
			System.out.println(number + "��5�����ł��B");
		} else if (number < 10) {
			System.out.println(number + "��5�ȏ�A10�����ł�");
		} else if (number < 15) {
			System.out.println(number + "��10�ȏ�A15�����ł�");
		} else {
			System.out.println(number + "�͂P�T�����ł͂Ȃ��ł�");
		}
		System.out.println("");

		// switch
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("�悭�ł��܂����I");
			break;
		case 2:
			System.out.println("���ʂł����I");
			break;
		case 1:
			System.out.println("�撣�낤�I");
			break;
		}

		// 8�͌J��Ԃ�
		number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("while01 = " + number);
		}
		// do while
		number = 1;

		do {
			number *= 2;
			System.out.println("Dowhile01 = " + number);
		} while (number < 50);

		System.out.println("");
		// for
		for (int number1 = 1; number1 < 5; number1++) {
			System.out.println("For02 = " + number1);
		}
		System.out.println("");

		// �g��for
		int[] i = { 1, 2, 3, 4, 5 };
		for (int i0 : i) {
			System.out.println("For02 = " + i0);
		}
		System.out.println("");

		// �����̃X�L�b�v
		for (int sss = 0; sss < 5; sss++) {
			if (sss == 2) {
				continue;
			}
			System.out.println("�X�L�b�v�e�X�g = " + sss);
		}
		System.out.println("");

		// �ċN����
		int ppp = 1;
		int pp = printNum(ppp);
		System.out.println("�߂�l��" + pp + "�ł��I");
	}

	// �ċN����
	public static int printNum(int pp) {
		if (pp < 50) {
			pp *= 2;
			System.out.println("while01 = " + pp);
			printNum(pp);
		}

		return pp;
	}

}
