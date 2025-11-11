// Nama - Nim
// Nama - Nim
// Nama - Nim (Optional)

import java.util.Scanner;

public class TFUNC {

	public static int HitungRekursif(int angka) {
		if (angka == 1) {
			return 1;
		}
		return angka + HitungRekursif(angka - 1);
	}

	public static String buildSeries(int n) {
		if (n == 1) {
			return "1";
		}
		return buildSeries(n - 1) + "+" + n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()) {
			sc.close();
			return;
		}
		int N = sc.nextInt();
		int hasil = HitungRekursif(N);

		System.out.println("Bilangan yang dimasukkan (N): " + N);
		System.out.println("Hasil perhitungan rekursif (" + buildSeries(N) + "): " + hasil);

		sc.close();
	}
}