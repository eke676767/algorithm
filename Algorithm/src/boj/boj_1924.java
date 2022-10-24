package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] strArr = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int sum = 0;

		for (int i = 0; i < a; i++) {
			if (i == a - 1) {
				sum += b;
				break;
			}
			sum += arr[i];
		}
		System.out.print(strArr[sum % 7]);
	}

}
