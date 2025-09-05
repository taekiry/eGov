package com.example.demo.common.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FileDelete {
	
	@Scheduled(fixedDelay = 2000)
	public void delete() {
		System.out.println("파일 삭제");
	}
}
