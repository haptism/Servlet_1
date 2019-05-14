package com.iu.t1;

import java.util.Random;

public class Test {
	
	//멤버변수선언
	//생성자선언
	//멤버메서드선언
	//0~10미만사이의 정수를 랜덤하게 하나를 리턴 메서드 
	//메서드명 getNum
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언들]){}
	//접근지정자 : public, protected, default, private
	//그외지정자 : static, abstract, final,
	public int getNum() {
		Random r = new Random();
		int num = r.nextInt(10);
		return num;
	}
	

}
