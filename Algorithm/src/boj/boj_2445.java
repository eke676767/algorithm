package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2445 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		br.close();
		/*
		 * 1 4 4 1
		 * 2 3 3 2
		 * 3 2 2 3
		 * 4 1 1 4
		 * 5 0 0 5
		 * 4 1 1 4
		 */
		
		for(int i=1; i<=n;i++) {
			for(int j = 0 ;j <i ; j++) {
				bw.append('*');
			}
			for(int j = 0;j<n*2 -i*2;j++) {
				bw.append(' ');
			}
			for(int j = 0 ;j <i ; j++) {
				bw.append('*');
			}
			bw.newLine();
		}
		
		for(int i = n-1; i>0; i--) {
			for(int j = 0 ;j <i ; j++) {
				bw.append('*');
			}
			for(int j = 0;j<n*2 -i*2;j++) {
				bw.append(' ');
			}
			for(int j = 0 ;j <i ; j++) {
				bw.append('*');
			}
			bw.newLine();
			
		}
		
		bw.flush();
		bw.close();
		
	}

}
