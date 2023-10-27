package diziSiralama;

import java.util.Scanner;

public class diziyiSirala {
	public static void main(String[] arg) {
		int[] dizi = new int[10];
		int i;
		int deger = 0;
		Scanner input = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			dizi[i] = input.nextInt();
		}

		for (i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (dizi[j] > dizi[j + 1]) {
					deger = dizi[j + 1];
					dizi[j + 1] = dizi[j];
					dizi[j] = deger;
				}

			}
		}
		for (i = 0; i < 10; i++) {
			System.out.printf("%d ", dizi[i]).println();
		}

	}
}
