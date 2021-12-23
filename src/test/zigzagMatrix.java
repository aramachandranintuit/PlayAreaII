package Test;

public class zigzagMatrix {
	public static void main(String[] args) {
		String str = "PAYPALISHIRING";
		char[][] a = new char[3][str.length()];
		for (int j = 0, k = 0; k < str.length(); j++) {
			for (int i = 0; i < 3; i++) {
				if (k < str.length()) {
					if (j == 0 || j % 2 == 0) {
						a[i][j] = str.charAt(k);
						k++;

					} else {
						if ((i + j) % 2 == 0) {
							a[i][j] = str.charAt(k);
							k++;
						} else {
							a[i][j] = ' ';
						}
					}
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (a[i][j] == ' ')
					j++;
				System.out.print(a[i][j]);
			}
		}

	}

}
