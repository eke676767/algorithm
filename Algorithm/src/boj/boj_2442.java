package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2442 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int len = 1 + (n - 1) * 2;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - 1 - i; j++) {
				bw.append(' ');
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				bw.append('*');
			}

			bw.newLine();
		}

		bw.flush();
		br.close();
		bw.close();

	}

}
