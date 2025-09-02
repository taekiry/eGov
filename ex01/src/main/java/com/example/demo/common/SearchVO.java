package com.example.demo.common;

import lombok.Data;

// int vs Integer
// Integer는 null값 가능
// int 초기값 : 0 / integer : null

@Data
public class SearchVO {
	Integer first;
	Integer last;
}