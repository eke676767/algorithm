package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11721 {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String msg = br.readLine();
		
		int len = msg.length();
		int n = len/10;
		
		for(int i = 0; i<n+1 ; i++) {
			if(i*10 + 10 < len) 
				System.out.println(msg.substring(i*10, i*10+10));
			else
				System.out.println(msg.substring(i*10, len));
		}
		
		
	}

}
