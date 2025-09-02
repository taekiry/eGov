package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyVO;

@SpringBootTest
public class ReplyMapperTest {
	
	@Autowired ReplyMapper replyMapper;
	
//	@Test
	public void insert() {
		// given  -> 데이터준비
		ReplyVO reply = new ReplyVO();
		reply.setBno(1L);
		reply.setReply("아무렇게나 넣는 댓글");
		reply.setReplyer("park");
		// when -> 실행
		int result = replyMapper.insert(reply);
		// then => 확인
		assertEquals(result, 1);
	}
	
	
	@Test
	public void getList() {
		ReplyVO reply = new ReplyVO();
		reply.setBno(1L);
		reply.setFirst(1);
		reply.setLast(5);
		List<ReplyVO> list =replyMapper.getList(reply);
		list.forEach(System.out::print);
		// :: 이중콜론 list.forEach(reply => System.out.println(reply));	
	}
}


