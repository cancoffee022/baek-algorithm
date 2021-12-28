package study;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String str="문자열/을 다양한 방법으로 토큰/화 해보/기";
		StringTokenizer st=	new StringTokenizer(str);//띄어쓰기 기준으로 문자열을 분리
		StringTokenizer st_1=new StringTokenizer(str,"/");//구분자 "/"를 기준으로 문자열을 분리
		StringTokenizer st_2=new StringTokenizer(str,"/",true);//구분자를 기준으로 문자열을 분리할 때 구분자도 토큰으로 넣을지 토큰에 포함시키지 않을지
		
		int i=1;
		while(st.hasMoreTokens()) { //다음 토큰이 있으면 실행
			System.out.println((i++)+"번째 토큰: "+st.nextToken());
		}
		i=1;
		while(st_1.hasMoreTokens()) { //다음 토큰이 있으면 실행
			System.out.println((i++)+"번째 토큰: "+st_1.nextToken());
		}
		i=1;
		while(st_2.hasMoreTokens()) { //다음 토큰이 있으면 실행
			System.out.println((i++)+"번째 토큰: "+st_2.nextToken());
		}
	}

}
