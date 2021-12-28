package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek_10250 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t=Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			st=new StringTokenizer(br.readLine());
			int h=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			int n=Integer.parseInt(st.nextToken());
			int Y,X;
			if(n%h==0) {
				Y=h*100;
				X=n/h;
			}else {
				Y=n%h*100;
				X=n/h+1;
			}
			bw.write((X+Y)+"\n");
		}
		bw.close();
	}

}
