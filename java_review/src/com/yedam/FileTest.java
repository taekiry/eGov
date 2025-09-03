package com.yedam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileTest {

//@Test
	public void list() {
		
		File file = new File("C:\\temp");
		String[] list = file.list();
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	
//	@Test
	public void delete() {
		File file = new File("c:/temp/copy3.PNG");
		file.delete();
	}
	
//	@Test
	public void rename() {
		File file = new File("c:/temp/copy2.PNG");
		file.renameTo(new File("c:/temp/renameFile.PNG"));
	}
	
	@Test
	public void copy() throws IOException {
		File file = new File("c:/temp/original.jpg");
		FileInputStream fi = new FileInputStream(file);
		FileOutputStream fo = new FileOutputStream(new File("c:/temp", "복사.PNG"));
		
		int temp;
		
		while( (temp = fi.read()) != -1 ) {
			fo.write(temp);
		}
		fi.close();
		fo.close();
	}
	
	
}
