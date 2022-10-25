package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2446 {

	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		br.close();

		for(int i=n; i>0;i--) {
			for(int j = i; n>j;j++) {
				bw.append(' ');
			}
			for(int j = i*2 -1 ;j>0;j--) {
				bw.append('*');
			}			
			bw.newLine();
		}
		for(int i=2;i<=n;i++) {
			for(int j = n-i;j>0;j--) {
				bw.append(' ');
			}
			for(int j = 0;j<i*2-1;j++) {
				bw.append('*');
			}
				
			bw.newLine();
		}
		
		
		
		bw.flush();
		bw.close();

	}

}
