public class learning_table {
	public static void main(String[] args) {
		// 7章 条件分岐
		int number = 7;

		if (number < 5) {
			System.out.println(number + "は5未満です");
		}
		if (number < 10) {
			System.out.println(number + "は10未満です");
		}
		if (number < 15) {
			System.out.println(number + "は15未満です");
		}
		System.out.println("");

		// else if
		if (number < 5) {
			System.out.println(number + "は5未満です。");
		} else if (number < 10) {
			System.out.println(number + "は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + "は10以上、15未満です");
		} else {
			System.out.println(number + "は１５未満ではないです");
		}
		System.out.println("");

		// switch
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("普通でした！");
			break;
		case 1:
			System.out.println("頑張ろう！");
			break;
		}

		// 8章繰り返し
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

		// 拡張for
		int[] i = { 1, 2, 3, 4, 5 };
		for (int i0 : i) {
			System.out.println("For02 = " + i0);
		}
		System.out.println("");

		// 処理のスキップ
		for (int sss = 0; sss < 5; sss++) {
			if (sss == 2) {
				continue;
			}
			System.out.println("スキップテスト = " + sss);
		}
		System.out.println("");

		// 再起処理
		int ppp = 1;
		int pp = printNum(ppp);
		System.out.println("戻り値は" + pp + "です！");
	}

	// 再起処理
	public static int printNum(int pp) {
		if (pp < 50) {
			pp *= 2;
			System.out.println("while01 = " + pp);
			printNum(pp);
		}

		return pp;
	}

}
