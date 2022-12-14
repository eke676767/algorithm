package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2441 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			
			for(int k =0;k<i;k++) {
				bw.append(' ');
			}
			
			for(int j = n; j>i ;j--) {
				bw.append('*');
			}
			bw.newLine();	
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

}
