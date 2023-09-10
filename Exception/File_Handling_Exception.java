package com.java.Exception;

import java.io.File;
import java.io.IOException;

public class File_Handling_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir");
		
		
		
		
		try {
		File file	 = new File(path+"fileHanding.txt");
//			if(file.createNewFile()) {
//				System.out.println("Your File is created");
//			}else {
//				System.out.println("Your file is already exists");
//			}
			boolean check = file.createNewFile();
			System.out.println(check);
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("input output exception");
		}
//		System.out.println(file.getAbsolutePath());
		
	}

}
