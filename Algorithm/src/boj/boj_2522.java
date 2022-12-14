package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2522 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		br.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				bw.append(' ');
			}
			for (int j = 0; j < i; j++) {
				bw.append('*');
			}
			bw.newLine();
		}

		for (int i = 1; i<n;i++) {
			for(int j = 0;j<i;j++) {
				bw.append(' ');
			}
			for(int j = 0;j<n-i; j++) {
				bw.append('*');
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}
