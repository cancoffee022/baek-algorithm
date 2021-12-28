package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Beak_2562_Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<9;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int max= list.get(0);
		
		for(int j=1;j<list.size();j++) {
			if(list.get(j)>max)
				max=list.get(j);
		}
		
		System.out.println(max);
		System.out.print(list.indexOf(max)+1);
	}

}
