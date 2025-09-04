package com.yedam.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.yedam.collet.EmpVO;


class NameComp implements Comparator<EmpVO>{

   @Override
   public int compare(EmpVO o1, EmpVO o2) {
      return o1.getDept() - o2.getDept();
   }


   }
   
public class LambdaTest {

   @Test
   public void test() {
      List<EmpVO> list = Arrays.asList(
            new EmpVO(100, "홍길동", 10), 
            new EmpVO(101, "김뽀민", 50),
            new EmpVO(102, "김단비", 20), 
            new EmpVO(103, "최길동", 30));

     // 익명 클래스 -> 람다식(추상 메서드가 하나인경우)
      list.sort((EmpVO o1, EmpVO o2) -> o1.getDept() - o2.getDept());
			
	     
    	  
      
      System.out.println(list);
      
   }

}
